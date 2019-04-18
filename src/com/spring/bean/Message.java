/**
 * 
 */
package com.spring.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pradeep
 *
 */
@Entity
@Table
public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	public Long id;
	public String senderName;
	public String message;
	public Date date;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String senderName, String message, Date date) {
	
		this.senderName = senderName;
		this.message = message;
		this.date = date;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the senderName
	 */
	public String getSenderName() {
		return senderName;
	}

	/**
	 * @param senderName the senderName to set
	 */
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", senderName=" + senderName + ", message=" + message + ", date=" + date + "]";
	}
	
	
	
	
	
}
