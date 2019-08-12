﻿<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String path=request.getContextPath();%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>权限树扩展分享</title>
    <link rel="stylesheet" href="<%=path%>/static/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="<%=path%>/static/layuiadmin/style/admin.css" media="all">
</head>
<body>
<div class="layui-container">
    <div class="layui-row">

        <div class="layui-col-md6 layui-col-md-offset1">
            <fieldset class="layui-elem-field layui-field-title"><legend>编辑权限</legend></fieldset>
            <!-- 此扩展能递归渲染一个权限树，点击深层次节点，父级节点中没有被选中的节点会被自动选中，单独点击父节点，子节点会全部 选中/去选中 -->
            <form class="layui-form">
                <div class="layui-form-item">
                    <label class="layui-form-label">选择权限</label>
                    <div class="layui-input-block">
                        <div id="LAY-auth-tree-index"></div>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" type="submit" lay-submit lay-filter="LAY-auth-tree-submit">提交</button>
                        <button class="layui-btn layui-btn-primary" type="reset">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script src="<%=path%>/static/common/jquery.min.js"></script>
<script src="<%=path%>/static/layuiadmin/layui/layui.js"></script>
<script type="text/javascript">
    layui.config({
        base: '<%=path%>/static/layuiadmin/lib/extend/',
    }).extend({
        authtree: 'authtree',
    }).use(['jquery', 'authtree', 'form', 'layer'], function(){
        var $ = layui.jquery;
        var authtree = layui.authtree;
        var form = layui.form;
        var layer = layui.layer;
        // 初始化
        $.ajax({
            url: '<%=path%>/employeePermission/listByRoleId?roleId='+'${roleId}',
            dataType: 'json',
            type:'post',
            success: function(data){
                var trees = authtree.listConvert(data.data.list, {
                    primaryKey: 'id'
                    ,startPid: 0
                    ,parentKey: 'parentId'
                    ,nameKey: 'name'
                    ,valueKey: 'id'
                    ,checkedKey: data.data.checkedId
                });
                // 渲染时传入渲染目标ID，树形结构数据（具体结构看样例，checked表示默认选中），以及input表单的名字
                authtree.render('#LAY-auth-tree-index', trees, {
                    inputname: 'authids[]'
                    ,layfilter: 'lay-check-auth'
                    // ,autoclose: false
                    // ,autochecked: false
                    // ,openchecked: true
                    // ,openall: true
                    ,autowidth: true
                });

                // PS:使用 form.on() 会引起了事件冒泡延迟的BUG，需要 setTimeout()，并且无法监听全选/全不选
                // PS:如果开启双击展开配置，form.on()会记录两次点击事件，authtree.on()不会
                form.on('checkbox(lay-check-auth)', function(data){
                    // 注意这里：需要等待事件冒泡完成，不然获取叶子节点不准确。
                    setTimeout(function(){
                        console.log('监听 form 触发事件数据', data);
                        // 获取选中的叶子节点
                        var leaf = authtree.getLeaf('#LAY-auth-tree-index');
                        console.log('leaf', leaf);
                        // 获取最新选中
                        var lastChecked = authtree.getLastChecked('#LAY-auth-tree-index');
                        console.log('lastChecked', lastChecked);
                        // 获取最新取消
                        var lastNotChecked = authtree.getLastNotChecked('#LAY-auth-tree-index');
                        console.log('lastNotChecked', lastNotChecked);
                    }, 100);
                });
                // 使用 authtree.on() 不会有冒泡延迟
                authtree.on('change(lay-check-auth)', function(data) {
                    console.log('监听 authtree 触发事件数据', data);
                    // 获取所有节点
                    var all = authtree.getAll('#LAY-auth-tree-index');
                    console.log('all', all);
                    // 获取所有已选中节点
                    var checked = authtree.getChecked('#LAY-auth-tree-index');
                    console.log('checked', checked);
                    // 获取所有未选中节点
                    var notchecked = authtree.getNotChecked('#LAY-auth-tree-index');
                    console.log('notchecked', notchecked);
                    // 获取选中的叶子节点
                    var leaf = authtree.getLeaf('#LAY-auth-tree-index');
                    console.log('leaf', leaf);
                    // 获取最新选中
                    var lastChecked = authtree.getLastChecked('#LAY-auth-tree-index');
                    console.log('lastChecked', lastChecked);
                    // 获取最新取消
                    var lastNotChecked = authtree.getLastNotChecked('#LAY-auth-tree-index');
                    console.log('lastNotChecked', lastNotChecked);
                });
                authtree.on('deptChange(lay-check-auth)', function(data) {
                    console.log('监听到显示层数改变',data);
                });
            }
        });
        form.on('submit(LAY-auth-tree-submit)', function(obj){
            var rid = '${roleId}';
            var authids = authtree.getChecked('#LAY-auth-tree-index');
            console.log('Choosed authids is', authids);
            $.ajax({
                url: '<%=path%>/employeePermission/updatePermission',
                dataType: 'json',
                type:'post',
                data: {rid:rid,authids:authids.toString()},
                success: function(res){
                    console.log(res);
                    if(res.code==0){
                        layer.msg("修改成功",{icon:6});
                        setTimeout(function () {
                            parent.closeAll();
                        },1000);

                    }else if(res.code==-1){
                        layer.alert("修改失败",{icon:5});
                        setTimeout(function () {
                            parent.closeAll();
                        },1000);
                    }else{
                       layer.open({
                            type: 1,
                            area: ['30%', '40%'],
                            fixed:false,
//                    maxmin: true,
                            title: '修改部门',
                            content:res
                        });

                    }
                }
            });
            return false;
        });
    });
</script>
</html>