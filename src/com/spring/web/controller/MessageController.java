/**
 * 
 */
package com.spring.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.Message;
import com.spring.event.MessageEvent;
import com.spring.service.IMessageService;

/**
 * @author Pradeep
 *
 */
@RestController
public class MessageController {

	@Autowired
	IMessageService messageService;

	@Autowired
	MessageEvent messageEvent;

	@GetMapping("/")
	public String home() {
		return "Spring REST";
	}

	@GetMapping("/messages")
	public List<MessageEvent> all() {

		List<MessageEvent> messageEventList = new ArrayList<MessageEvent>();

		for (Message message : messageService.list()) {
			MessageEvent messageEvent = new MessageEvent();
			BeanUtils.copyProperties(message, messageEvent);
			messageEventList.add(messageEvent);
		}
		
		return messageEventList;
	}

	@PostMapping("/message")
	public MessageEvent create(@RequestBody Message message) {

		BeanUtils.copyProperties(messageService.create(message), messageEvent);
		return messageEvent;
	}

	@GetMapping("/message/{id}")
	public MessageEvent get(@PathVariable Long id) {

		BeanUtils.copyProperties(messageService.get(id), messageEvent);
		return messageEvent;

	}

	@PutMapping("/message/{id}")
	public MessageEvent update(@RequestBody Message message, @PathVariable Long id) {

		BeanUtils.copyProperties(messageService.update(message, id), messageEvent);
		return messageEvent;
	}

	@DeleteMapping("/message/{id}")
	public void delete(@PathVariable Long id) {
		messageService.delete(id);
	}
}
