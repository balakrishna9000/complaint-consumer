package com.dxctraining.consumermgt.consumer.dao;

import com.dxctraining.consumermgt.consumer.entities.Consumer;
import com.dxctraining.consumermgt.exceptions.ConsumerNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ConsumerDaoImpl implements IConsumerDao {

    @PersistenceContext
    private EntityManager entityManager;
    

	@Override
	public  Consumer add(Consumer consumer) { 
	  entityManager.persist(consumer);
		return consumer;
	}

    
    @Override
    public List<Consumer> allConsumers() {
        String jpaql="from Consumer";
        TypedQuery<Consumer>query=entityManager.createQuery(jpaql,Consumer.class);
        List<Consumer>consumerList=query.getResultList();
        return consumerList;
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
