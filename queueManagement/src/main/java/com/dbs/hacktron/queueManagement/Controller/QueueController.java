package com.dbs.hacktron.queueManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.hacktron.queueManagement.dto.QueueDto;
import com.dbs.hacktron.queueManagement.service.QueueManagmentService;



@RestController
public class QueueController {
	
	@Autowired
	QueueManagmentService queueManagmentService;
	
	
	@RequestMapping( method = RequestMethod.GET,path="/queue/get")
	public List<QueueDto> getAllQueues()
	{
		return queueManagmentService.getAllQueues();
	}
	
	
	

}
