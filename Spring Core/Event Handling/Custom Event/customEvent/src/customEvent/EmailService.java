package customEvent;

import java.util.List;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EmailService implements ApplicationEventPublisherAware {
	private List<String> blackList;		// contains all the black listed addresses(added via XML);
	private ApplicationEventPublisher publisher;
	
	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void sendEmail(String address) {
		if (blackList.contains(address)) {			// If this address is black listed then BlackListEvent occurs and BlackListListener's onApplicationEvent() method will execute.
			BlackListEvent event = new BlackListEvent(this, address);
			publisher.publishEvent(event);
		}
		else{
			System.out.println("Sending mail to : "+address);	// If this address is not a black listed address then else caluse will execute.
		}
	}
}
