package com.dxctraining.complaintmgt.complaint.service;

import com.dxctraining.complaintmgt.complaint.entities.Complaint;
import com.dxctraining.complaintmgt.complaint.dao.IComplaintDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ComplaintServiceImpl implements IComplaintService {

   @Autowired
    private IComplaintDao dao;

    @Override
    public Complaint findComplaintById(int id) {
        Complaint complaint=dao.findComplaintById(id);
        return complaint;
    }

    @Override
    public Complaint  add(Complaint complaint) {
        complaint=dao.add(complaint);
        return complaint;
    }
}
