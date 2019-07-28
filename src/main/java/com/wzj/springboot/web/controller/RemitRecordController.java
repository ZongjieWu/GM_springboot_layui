package com.wzj.springboot.web.controller;
import com.wzj.springboot.model.RemitRecord;
import com.wzj.springboot.service.service.RemitRecordService;
import com.wzj.springboot.enums.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import springfox.documentation.annotations.ApiIgnore;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * Created by Zongjie Wu on 2019/07/28.
 */
@ApiIgnore
@RestController
@RequestMapping("/remitRecord/")
public class RemitRecordController {

    @Autowired
    private RemitRecordService remitRecordService;

    @ApiIgnore
    @PostMapping("add")
    public Map<String,Object> add(RemitRecord remitRecord) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        remitRecord.setAddTime(simpleDateFormat.format(new Date()));
        remitRecord.setModifyTime(simpleDateFormat.format(new Date()));
        remitRecordService.save(remitRecord);
        return Result.retrunSucess();
    }

    @ApiIgnore
    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    remitRecordService.deleteById(id);
	    return Result.retrunSucess();
    }

    @ApiIgnore
    @PostMapping("update")
    public Map<String,Object> update(RemitRecord remitRecord) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        remitRecord.setModifyTime(simpleDateFormat.format(new Date()));
	    remitRecordService.update(remitRecord);
	    return Result.retrunSucess();
    }

    @ApiIgnore
    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        RemitRecord remitRecord = remitRecordService.findById(id);
        return Result.retrunSucessMsgData(remitRecord);
    }

    @ApiIgnore
    @PostMapping("paging")
    public Map<String,Object> paging(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        Example example=new Example(RemitRecord.class);
        Example.Criteria criteria=example.createCriteria();
        PageHelper.startPage(page, limit);
        PageInfo<RemitRecord> remitRecordPageInfo = remitRecordService.queryPageListByWhereExample(" id desc",page,limit,example);
        Map<String,Object> map=Result.retrunSucessMsgData(remitRecordPageInfo.getList());
        map.put("count",remitRecordPageInfo.getTotal());
        return map;
    }
}
