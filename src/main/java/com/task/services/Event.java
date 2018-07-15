package com.task.services;

public enum Event {

	EVENT_COVNS_ADD(0, "/im/conversation/add"), 
	EVENT_COVNS_DEL(1, "/im/conversation/delete");

	private int eventId;
	private String eventName;

	private Event(int eventId, String eventName) {
		this.eventId = eventId;
		this.eventName = eventName;
	}

	public int getEventId() {
		return eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public static Event fromValue(byte eventId) {
		for (Event flag : Event.values()) {
			if (flag.getEventId() == eventId) {
				return flag;
			}
		 }
		return null;
	}

}
