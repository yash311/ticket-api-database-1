package com.learning.ticketapi;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author AI
 *
 */

@Entity
public class Ticket {
	public final static String PRIORITY_HIGH = "HIGH";
	public final static String PRIORITY_MEDIUM = "MEDIUM";
	public final static String PRIORITY_LOW = "LOW";
	

	public final static String STATUS_DONE = "DONE";
	public final static String STATUS_OPEN = "OPEN";
	public final static String STATUS_IN_REVIEW = "IN_REVIEW";
	public final static String STATUS_IN_VERIFICATION = "IN_VERIFICATION";
	public final static String STATUS_IN_PROGRESS = "IN_PROGRESS";
	
	@Id    //Marking as Primary key
	private String ticketKey;
	
	private String comment;
	private String status;
	private String priority;
	
	
	
	public Ticket() {
	}



	/**
	 * @param ticketKey
	 * @param comment
	 * @param status
	 * @param priority
	 */
	public Ticket(String ticketKey, String comment, String status, String priority) {
		this.ticketKey = ticketKey;
		this.comment = comment;
		this.status = status;
		this.priority = priority;
	}



	public String getTicketKey() {
		return ticketKey;
	}



	public void setTicketKey(String ticketKey) {
		this.ticketKey = ticketKey;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getPriority() {
		return priority;
	}



	public void setPriority(String priority) {
		this.priority = priority;
	}



	@Override
	public String toString() {
		return "Ticket [ticketKey=" + ticketKey + ", comment=" + comment + ", status=" + status + ", priority="
				+ priority + "]";
	}
	
	
	
	
}
