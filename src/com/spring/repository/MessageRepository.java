/**
 * 
 */
package com.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.bean.Message;

/**
 * @author Pradeep
 *
 */
public interface MessageRepository extends CrudRepository<Message, Long> {
	
	List<Message> findAllByOrderByDateDesc();

}
