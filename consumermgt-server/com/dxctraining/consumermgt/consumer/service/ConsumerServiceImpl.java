package com.dxctraining.consumermgt.consumer.service;

import com.dxctraining.consumermgt.consumer.entities.Consumer;
import com.dxctraining.consumermgt.consumer.dao.IConsumerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ConsumerServiceImpl implements IConsumerService {

   @Autowired
    private IConsumerDao dao;

    @Override
    public Consumer findConsumerById(int id) {
        Consumer consumer=dao.findConsumerById(id);
        return consumer;
    }

    @Override
    public Consumer add(Consumer consumer) {
        consumer=dao.add(consumer);
        return consumer;
    }

}
