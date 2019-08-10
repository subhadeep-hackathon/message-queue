package com.dbs.hacktron.queueManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.hacktron.queueManagement.dto.QueueDto;
import com.dbs.hacktron.queueManagement.entity.Queue;
import com.dbs.hacktron.queueManagement.jpaRepository.QueueRepository;
import com.dbs.hacktron.queueManagement.mapper.QueueMapper;


@Service
public class QueueManagmentService {
	
	@Autowired
	QueueRepository queueRepository;
	
	@Autowired
	QueueMapper queueMapper;
	
	public List<QueueDto> getAllQueues()
	{
		List<Queue> queues = queueRepository.findAll();
		return queueMapper.toQueueDtos(queues);
	}

}
