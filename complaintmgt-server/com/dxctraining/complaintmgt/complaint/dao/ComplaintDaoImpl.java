package com.dxctraining.complaintmgt.complaint.dao;

import com.dxctraining.complaintmgt.complaint.entities.Complaint;
import com.dxctraining.complaintmgt.exceptions.ComplaintNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ComplaintDaoImpl implements IComplaintDao {

    @PersistenceContext
    private EntityManager entityManager;
    

	@Override
	public  Complaint add(Complaint complaint) { 
	  entityManager.persist(complaint);
		return complaint;
	}

    
    @Override
    public List<Complaint> allComplaints() {
        String jpaql="from Complaint";
        TypedQuery<Complaint>query=entityManager.createQuery(jpaql,Complaint.class);
        List<Complaint>complaintList=query.getResultList();
        return complaintList;
    }

    
    
    @Override
    public Complaint findComplaintById(int id) {
    	Complaint complaint = entityManager.find(Complaint.class, id);
        if(complaint==null){
            throw new ComplaintNotFoundException("complaint not found for id="+id);
        }
        return complaint;
    }


}
