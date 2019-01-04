package bo.com.mc4.jms.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.com.mc4.jms.client.JmsClient;
import bo.com.mc4.jms.consumer.JmsConsumer;
import bo.com.mc4.jms.producer.JmsProducer;

@Service
public class JmsClientImpl implements JmsClient{

	@Autowired
	JmsConsumer jmsConsumer;
	
	@Autowired
	JmsProducer jmsProducer;
	
	@Override
	public void send(String msg) {
		jmsProducer.send(msg);
	}

	@Override
	public String receive() {
		return jmsConsumer.receive();
	}

}
