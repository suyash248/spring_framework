package customEvent;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static AbstractApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("abc.xml"); 
		EmailService emailService=(EmailService)context.getBean("emailService");
		emailService.sendEmail("abhi.soni@gmail.com");
		context.close();
	}
}
