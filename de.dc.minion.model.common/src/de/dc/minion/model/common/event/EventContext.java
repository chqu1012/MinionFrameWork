package de.dc.minion.model.common.event;

public class EventContext<T>{

	private String eventId;
	private T input;
	
	public EventContext(String eventId, T input) {
		this.eventId = eventId;
		this.input = input;
	}

	public T getInput() {
		return input;
	}

	public String getEventId() {
		return eventId;
	}

}
