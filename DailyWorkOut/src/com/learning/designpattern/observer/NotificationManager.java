/**
 * 
 */
package com.learning.designpattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  NotificationManager
 *  
 *  keeps the subscriber list ( watchlist), through NotificationManager you can subscribe or unsusbscribe for an event
 *  
 *  notify() helps to notify the subscribers/observer's
 * 
 * 
 * @author bijuvas
 *
 */
public class NotificationManager {

	private Map<String, List<EventListener>> watchlist;
	
	public NotificationManager() {
		this.watchlist = new HashMap<>();
		addEvents();
	}
	
	public void notify(String eventType, Breakout file) {
		List<EventListener> users = watchlist.get(eventType);
		users.forEach(user -> {
			user.update(eventType, file);
		});
	}
	
	public void subscribe(String eventType, EventListener listener) {
		List<EventListener> users = watchlist.get(eventType);
		users.add(listener);
	}
	
	public void unsubscribe(String eventType, EventListener listener) {
		List<EventListener> users = watchlist.get(eventType);
		users.remove(listener);
	}

	public void addEvents() {
		final Alerts[] alerts = Alerts.values();
		for (Alerts event : alerts) {
            this.watchlist.put(event.toString(), new ArrayList<>());
        }
	}
}
