package com.dbs.hacktron.queueManagement.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.hacktron.queueManagement.entity.Message;

public interface MessageRespository extends JpaRepository<Message, Long> {

}
