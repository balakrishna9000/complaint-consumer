package com.dxctraining.complaintmgt.complaint.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "complaints")
@Entity
public class Complaint {

    @Id
    @GeneratedValue
    private Integer id;

    private String descrpition;

	private String Consumer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }

	public String getConsumerId() {
		
		return Consumer;
	}

	public void setConsumer(String consumer) {
		this.Consumer = consumer;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complaint that = (Complaint) o;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.intValue();
    }

}
s