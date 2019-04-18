/**
 * 
 */
package com.spring.service;

import java.util.List;

import com.spring.bean.Message;

/**
 * @author Pradeep
 *
 */
public interface IMessageService {
	
	Message create(Message message);
	Message get(Long id);
	List<Message> list();
	Message update(Message message, Long id);
	void delete(Long id);
}
