package com.wzj.springboot.service;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 * Created by zhh on 2017/09/18.
 */
public interface Service<T> {

    /**
     * 分页查询
     * 使用example 查询
     * @param page
     * @param rows
     * @param o
     * @return
     */
    PageInfo<T> queryPageListByWhereExample(String sort, Integer page, Integer rows, Object o) ;


    /**
     * 根据条件查询数据列表
     * 使用example 查询
     * @param o
     * @return
     */
    List<T> queryListByWhereExample(Object o);

    /**
     * 根据条件查询数据列表
     *
     * @param record
     * @return
     */
    List<T> queryListByWhere(T record);


    /**
	 * 插入数据
	 * @param model
	 */
    void save(T model);

    /**
     * 批量插入数据
     * @param models
     */
    void save(List<T> models);

    /**
     * 通过主鍵刪除
     * @param id
     */
    void deleteById(Long id);

    /**
     * 批量刪除
     * @param ids eg：ids -> "1,2,3,4"
     */
    void deleteByIds(String ids);

    /**
     * 根据条件做删除
     *
     * @param t
     * @return
     */
    void deleteByWhere(T t);


    /**
     * 更新
     * @param model
     */
    void update(T model);

    /**
     * 通过ID查找
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
     * @param fieldName
     * @param value
     * @return
     * @throws TooManyResultsException
     */
    T findBy(String fieldName, Object value) throws TooManyResultsException;

    /**
     * 通过Model中条件（非数据表中column的名称）查找,value需符合unique约束
     * @return
     */
    T findOne(T model);

    /**
     * 通过多个ID查找
     * @param ids eg：ids -> "1,2,3,4"
     * @return
     */
    List<T> findByIds(String ids);

    /**
     * 根据条件查找
     * @param condition
     * @return
     */
    List<T> findByCondition(Condition condition);

    /**
     * 获取所有
     * @return
     */
    List<T> findAll();

}
