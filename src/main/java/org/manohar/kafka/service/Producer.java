package org.manohar.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class Producer {
public static final String topic = "FirstTopic";
public static final String topicOne="SecondTopic";
@Autowired
private KafkaTemplate<String, String> kafkaTemp;
public void publishToTopic(String message) {
	System.out.println("Publishing to topic "+topic);
	this.kafkaTemp.send(topic,message);
	this.kafkaTemp.send(topicOne,message);
} 
}
