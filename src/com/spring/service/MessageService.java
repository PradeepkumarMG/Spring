/**
 * 
 */
package com.spring.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bean.Message;
import com.spring.repository.MessageRepository;

/**
 * @author Pradeep
 *
 */
@Service
public class MessageService implements IMessageService{
	
	@Autowired
	MessageRepository messageRepository;
	
		
	@Override
	public Message create(Message message) {
		
		Date current = new Date();
		message.setDate(current);
		return messageRepository.save(message);
	}

	@Override
	public Message get(Long id) {
		return messageRepository.findOne(id);
	}

	@Override
	public Message update(Message message, Long id) {
		return messageRepository.save(message);
	}

	@Override
	public void delete(Long id) {
		messageRepository.delete(id);
	}

	@Override
	public List<Message> list() {
		return (List<Message>) messageRepository.findAllByOrderByDateDesc();
	}
}
