package innerBeans;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
	public static void main(String[] args) {  
		Resource r=new ClassPathResource("abc.xml");  
		BeanFactory factory=new XmlBeanFactory(r);  
      
		Employee e1=(Employee)factory.getBean("employee1");  
		Employee e2=(Employee)factory.getBean("employee2");   
        
		e1.show();
		e2.show();
		
	}  
}  
