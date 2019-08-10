package com.dbs.hacktron.queueManagement.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.dbs.hacktron.queueManagement.dto.QueueDto;
import com.dbs.hacktron.queueManagement.entity.Queue;

@Mapper(componentModel = "spring")
public interface QueueMapper {
	
    public QueueDto toQueueDto(Queue queueObj);
	
    public Queue toQueue(QueueDto queueDtoObj);
	
    public List<QueueDto> toQueueDtos(List<Queue> queues );

}
