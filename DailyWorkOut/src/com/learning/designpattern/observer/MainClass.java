/**
 * 
 */
package com.learning.designpattern.observer;

/**
 * @author valiyakode perambra
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stock editor = new Stock();
		NotificationManager event = editor.events;
		event.subscribe(Alerts.STOPLOSS.toString(), new EmailNotificationListener("test@gmail.com"));
		editor.stoploss("SGX");
	}

}
