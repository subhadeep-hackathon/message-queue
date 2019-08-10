package com.dbs.hacktron.queueManagement.dto;

public class MessageDto {

	private Long id;
	private String messageName;	
	private long orderSeq;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public long getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(long orderSeq) {
		this.orderSeq = orderSeq;
	}
	
	public MessageDto(){}
}
