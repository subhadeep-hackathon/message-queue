package com.dbs.hacktron.queueManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbs.hacktron.queueManagement.entity.Message;
import com.dbs.hacktron.queueManagement.entity.Queue;
import com.dbs.hacktron.queueManagement.jpaRepository.MessageRespository;
import com.dbs.hacktron.queueManagement.jpaRepository.QueueRepository;



@Component
public class QueueCommandLinerRunner implements CommandLineRunner{

	
	private static final Logger log = LoggerFactory.getLogger(QueueCommandLinerRunner.class);
	
	@Autowired
	MessageRespository messageRespository;
	
	@Autowired
	QueueRepository queueRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
//		Guide guide = new Guide("2000IM10901", "Ian Lamb", 2000);
//		Student student = new Student("2014AL50456", "Amy Gill", guide);
		
	Queue queue1= new Queue("First Queue", 10 );
	Message message1 = new Message("Hello World",queue1);
	
	//log.info("Students is inserted with id : "+ studentJPARepository.save(student));
	log.info("data inserted ---- >>>" + messageRespository.save(message1));
	
		
	}
	

}
