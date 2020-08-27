package com.dxctraining.complaintmgt.complaint.service;

import com.dxctraining.complaintmgt.complaint.entities.Complaint;

public interface IComplaintService {


	Complaint add(Complaint complaint);
		
	Complaint findComplaintById(int id);

	    	}
