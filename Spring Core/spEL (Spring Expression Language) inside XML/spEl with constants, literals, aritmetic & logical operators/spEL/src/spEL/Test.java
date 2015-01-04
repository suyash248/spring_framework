package spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
	private static ApplicationContext context;

	public static void main(String[] args) {  
		context = new ClassPathXmlApplicationContext("abc.xml");  
      
		Employee e1=(Employee)context.getBean("employee1");  
		Employee e2=(Employee)context.getBean("employee2");   
        
		e1.show();
		e2.show();
	}  
}  
