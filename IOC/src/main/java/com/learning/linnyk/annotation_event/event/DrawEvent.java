package com.learning.linnyk.annotation_event.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author LinnykOleh
 */
public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "=== Draw Event ===";
	}
}
