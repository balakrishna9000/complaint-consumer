package com.dxctraining.complaintmgt.complaint.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateComplaintRequest {

    @NotBlank
    @Size(min = 2)
    private String name;
	private String descrpition;

    public String getDescrpition() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }


}
