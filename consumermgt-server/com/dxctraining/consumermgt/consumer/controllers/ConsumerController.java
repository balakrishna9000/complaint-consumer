package com.dxctraining.consumermgt.consumer.controllers;

import com.dxctraining.consumermgt.consumer.dto.CreateConsumerRequest;
import com.dxctraining.consumermgt.consumer.dto.ConsumerDto;
import com.dxctraining.consumermgt.consumer.entities.Consumer;
import com.dxctraining.consumermgt.consumer.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

/**
 * @NotNull , @Min(nunm)  @Max(number) for validating minimum and maximum number
 * @NotBlank for string
 */
@Validated
@RestController
@RequestMapping("/consumers")
public class ConsumerController {

    @Autowired
    private IConsumerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ConsumerDto add(@Valid @NotNull @RequestBody CreateConsumerRequest requestData) {
        Consumer consumer = new Consumer();
        Consumer.setName(requestData.getName());
        consumer = service.add(consumer);
        ConsumerDto response = toDto(consumer);
        return response;
    }

    @GetMapping("/get/{id}")
    public ConsumerDto getConsumer( @PathVariable("id") int id) {
        Consumer consumer = service.findConsumerById(id);
        ConsumerDto response = toDto(consumer);
        return response;
    }

    public ConsumerDto toDto(Consumer consumer) {
       ConsumerDto dto = new ConsumerDto();
        dto.setId(consumer.getId());
        dto.setName(consumer.getName());
        return dto;
    }

}
