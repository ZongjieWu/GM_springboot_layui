package com.wzj.springboot.service.impl;

import com.wzj.springboot.dao.mapper.RemitRecordMapper;
import com.wzj.springboot.model.RemitRecord;
import com.wzj.springboot.service.service.RemitRecordService;
import com.wzj.springboot.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by Zongjie Wu on 2019/07/28.
 */
@Service
public class RemitRecordServiceImpl extends AbstractService<RemitRecord> implements RemitRecordService {

    @Autowired
    private RemitRecordMapper remitRecordMapper;

}
