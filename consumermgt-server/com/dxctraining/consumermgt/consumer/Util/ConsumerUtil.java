package com.dxctraining.consumermgt.consumer.Util;

	import org.springframework.stereotype.Component;

	import com.dxctraining.consumermgt.consumer.dto.ConsumerDto;
	import com.dxctraining.consumermgt.consumer.entities.Consumer;

		@Component
		public class ConsumerUtil {
			public ConsumerDto consumerDto(Consumer consumer, int consumerId, String consumerName) {
				ConsumerDto dto = new ConsumerDto();
				dto.setId(consumerId);
				dto.setName(consumerName);
				dto.setName(consumer.getName());
				return dto;
			}
}
