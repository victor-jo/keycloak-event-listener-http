package org.softwarefactory.keycloak.providers.events.http;

import java.io.Serializable;

import org.keycloak.events.Event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.CLASS)
public class ClientEventNotification extends Event implements Serializable {

	private static final long serialVersionUID = -2192461924304841222L;
	
	public static ClientEventNotification create(Event event) {
		ClientEventNotification msg = new ClientEventNotification();
		msg.setClientId(event.getClientId());
		msg.setDetails(event.getDetails());
		msg.setError(event.getError());
		msg.setIpAddress(event.getIpAddress());
		msg.setRealmId(event.getRealmId());
		msg.setSessionId(event.getSessionId());
		msg.setTime(event.getTime());
		msg.setType(event.getType());
		msg.setUserId(event.getUserId());

		return msg;
	}

	
}