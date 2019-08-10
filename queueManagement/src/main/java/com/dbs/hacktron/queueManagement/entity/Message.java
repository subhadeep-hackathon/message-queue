package com.dbs.hacktron.queueManagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String messageName;	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long orderSeq;
	
//	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="queue_id")
	private Queue queue;

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public Queue getQueue() {
		return queue;
	}

	public void setQueue(Queue queue) {
		this.queue = queue;
	}

	public Long getId() {
		return id;
	}

	public long getOrderSeq() {
		return orderSeq;
	}

	public Message(String messageName, Queue queue) {
		super();
		this.messageName = messageName;
		this.queue = queue;
	}
	
	public Message()
	{}
	
	
	

}
