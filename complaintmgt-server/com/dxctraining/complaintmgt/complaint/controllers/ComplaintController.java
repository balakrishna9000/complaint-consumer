package com.dxctraining.complaintmgt.complaint.controllers;

import com.dxctraining.complaintmgt.complaint.dto.CreateComplaintRequest;
import com.dxctraining.complaintmgt.complaint.dto.ComplaintDto;
import com.dxctraining.complaintmgt.complaint.entities.Complaint;
import com.dxctraining.complaintmgt.complaint.service.IComplaintService;
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
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private IComplaintService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ComplaintDto add(@Valid @NotNull @RequestBody CreateComplaintRequest requestData) {
    	Complaint complaint = new Complaint();
    	complaint.setDescrpition(requestData.getDescrpition());
    	complaint = service.add(complaint);
    	ComplaintDto response = toDto(complaint);
        return response;
    }

    @GetMapping("/get/{id}")
    public ComplaintDto getComplaint( @PathVariable("id") int id) {
    	Complaint complaint = service.findComplaintById(id);
    	ComplaintDto response = toDto(complaint);
        return response;
    }

    public ComplaintDto toDto(Complaint String) {
    	ComplaintDto dto = new ComplaintDto();
        dto.setId(String.getId());
        dto.setName(String.getDescription());
        return dto;
    }

}
