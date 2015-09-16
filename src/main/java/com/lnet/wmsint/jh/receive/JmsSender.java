package com.lnet.wmsint.jh.receive;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

public class JmsSender {

    private JmsTemplate jmsTemplate;
    private Destination destination;

    public void setConnectionFactory(ConnectionFactory cf) {
        this.jmsTemplate = new JmsTemplate(cf);
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void Send(final String content, final int processedCount) {
        this.jmsTemplate.send(this.destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                message.setInt("processedCount", processedCount);
                message.setString("content", content);
                return message;
            }
        });
    }
}
