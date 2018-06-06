package core;

import core.domain.Item;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

public class ItemMessageConverter implements MessageConverter {

    @Override
    public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
        return session.createTextMessage(object.toString());
    }

    @Override
    public Object fromMessage(Message message) throws JMSException, MessageConversionException {
        return new Item();
    }
}
