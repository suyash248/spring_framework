package springCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringColMain {
	private String someNullProperty="Filled";  // Forcefully 'null' will be assigned to this property.
	
	public String getSomeNullProperty() {
		return someNullProperty;
	}

	public void setSomeNullProperty(String someNullProperty) {
		this.someNullProperty = someNullProperty;
	}
	
	public void perform(){
		System.out.println("someNonNullProperty : "+getSomeNullProperty());
	}
	
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("abc.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		SpringColMain band=(SpringColMain)factory.getBean("band");
		band.perform();
	}
}