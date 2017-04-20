package com.xmq.service;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xmq.mapper.TestingMapper;
import com.xmq.model.Testing;

@Service
//@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class TestingService {

    @Autowired
    private TestingMapper testingMapper;

    public void insert() throws Exception {
        testingMapper.insert(new Testing("" + new Random().nextInt(), "" + new Random().nextInt()));
        testingMapper.insert(new Testing()); // this will throw an exception
    }
}
