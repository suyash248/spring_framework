package customEvent;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {
	private final String address;
	
	public BlackListEvent(Object source, String address) {
		super(source);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
