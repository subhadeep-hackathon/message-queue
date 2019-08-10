package com.dbs.hacktron.queueManagement.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Queue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String queueName;
	
	@OneToMany(mappedBy="queue", cascade=CascadeType.ALL)
	private Set<Message> messages = new HashSet<Message>();	
	
	
	private long queueSize;
	
	

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public Set<Message> getMessages() {
		return messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	public long getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(long queueSize) {
		this.queueSize = queueSize;
	}

	public Long getId() {
		return id;
	}

	public Queue(String queueName, long queueSize) {
		super();
		this.queueName = queueName;
		
		this.queueSize = queueSize;
	}
	
	public Queue()
	{}
	
}
