package com.javabeat;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class MyScope implements Scope {
	private Map<String, Object> objectMap = Collections.synchronizedMap(new HashMap<String, Object>());

	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (!objectMap.containsKey(name)) {
			objectMap.put(name, objectFactory.getObject());
		}
		return objectMap.get(name);
	}

	public Object remove(String name) {
		return objectMap.remove(name);
	}

	public void registerDestructionCallback(String name, Runnable callback) { 
		// do nothing
		
		//This method is a callback method and gets invoked when the object in this scope is destroyed.
	}

	public Object resolveContextualObject(String key) {
		return null;
	
		// This depends on the scope and implementation. For example session scope it returns the sessionid.
	}

	public String getConversationId() {
		return "MyScope";
	}

	public void clearBean() {		// Beans have to invoke thid method in order to be destroyed.
		objectMap.clear();
	}
}