package com.dxctraining.consumermgt.consumer.service;

import com.dxctraining.consumermgt.consumer.entities.Consumer;

public interface IConsumerService {

	Consumer add(Consumer consumer);
	
	Consumer findConsumerById(int id);

}
