package customEvent;

import org.springframework.context.ApplicationListener;

public class BlackListListener implements ApplicationListener<BlackListEvent>{
	
		private String notificationAddress;
		
		public void setNotificationAddress(String notificationAddress) {
			this.notificationAddress = notificationAddress;
		}
		
		public void onApplicationEvent(BlackListEvent blackListEvent) {	// If even occured , i.e. if address is black listed then this method will be executed.
			System.out.println("WARNING !! Black listed address : "+blackListEvent.getAddress());
			System.out.println("Notifying Client to this address : "+notificationAddress);
		}
}
