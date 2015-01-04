package customEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		EmailService emailService=(EmailService)context.getBean("emailService");
		emailService.sendEmail("suyash248@gmail.com");
	}
}
