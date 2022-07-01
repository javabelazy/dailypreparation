/**
 * 
 */
package com.learning.designpattern.observer;

/**
 * EmailNotificationListener
 * 
 * @author perambra kozhikode
 *
 */
public class EmailNotificationListener implements EventListener {
	private String email;
	
	public EmailNotificationListener(String email) {
		this.email = email;
	}

	@Override
	public void update(String eventType, Breakout breakout) {
		System.out.println(" email send to "+email +" for "+eventType);
	}

}
