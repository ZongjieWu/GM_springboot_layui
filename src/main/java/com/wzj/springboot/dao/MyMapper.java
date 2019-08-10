package com.wzj.springboot.dao;

import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 通用 Mapper, 如果被扫描到会报异常
 * Created by zhh on 2017/09/18.
 */
@Component
public interface MyMapper<T> extends Mapper<T>,BaseMapper<T>, ConditionMapper<T>, IdsMapper<T>, InsertListMapper<T> {
}
