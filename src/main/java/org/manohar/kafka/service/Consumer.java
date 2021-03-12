package org.manohar.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics = "FirstTopic", groupId = "mygroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consuming message " + message);
	}
	@KafkaListener(topics = "SecondTopic", groupId = "mygroup")
	public void consumeFromTopicOne(String message) {
		System.out.println("Consuming message from second topic " + message);
	}
}
