package com.dbs.hacktron.queueManagement.dto;

import java.util.Set;



public class QueueDto {

	private Long id;
	private String queueName;
	private long queueSize;
	private Set<MessageDto> messages ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public long getQueueSize() {
		return queueSize;
	}
	public void setQueueSize(long queueSize) {
		this.queueSize = queueSize;
	}
	public Set<MessageDto> getMessages() {
		return messages;
	}
	public void setMessages(Set<MessageDto> messages) {
		this.messages = messages;
	}
	
	public QueueDto()
	{
		
	}
}
