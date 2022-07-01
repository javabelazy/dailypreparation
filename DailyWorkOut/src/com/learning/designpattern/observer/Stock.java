package com.learning.designpattern.observer;

import java.io.File;
/**
 * Stock class
 * Act as Observable or publisher
 * 
 * Where ever a change happens in Stock object (publisher), it will notifies the subscribers
 * 
 * two methods stoploss() & entry() corresponds to file opening and saving events
 * 
 *
 * 
 * 
 * @author smithesh k k
 *
 */
public class Stock {

	private Breakout breakout;
	public NotificationManager events;

	public Stock() {
		this.events = new NotificationManager(); 
	}

	public void stoploss(String nseTicker) {
		if (!nseTicker.isEmpty()) {
			this.breakout = new Breakout(nseTicker);
			events.notify(Alerts.STOPLOSS.toString(), breakout);
		}
	}

	public void entry(String nseTicker) {
		if (!nseTicker.isEmpty()) {
			this.breakout = new Breakout(nseTicker);
			events.notify(Alerts.ENTRY.toString(), breakout);
		}
	}

}
