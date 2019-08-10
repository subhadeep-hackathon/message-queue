package com.dbs.hacktron.queueManagement.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.hacktron.queueManagement.entity.Queue;

@Repository
public interface QueueRepository extends JpaRepository<Queue, Long> {

}
