package com.dxctraining.complaintmgt.complaint.dto;

	public class ComplaintDto {
	    private Integer id;

	    private String name;

		private int consumerId;

		private String description;

		private String consumerName;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

			
	    public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getConsumerId() {
			return consumerId;
		}

		public void setConsumerId(int consumerId) {
			this.consumerId = consumerId;
		}

		public String getConsumerName() {
			return consumerName;
		}

		public void setConsumerName(String consumerName) {
			this.consumerName = consumerName;
		}

	}	
