package springCollection;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringColMain {
	private Properties instruments;
	
	public Properties getInstruments() {
		return instruments;
	}

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}

	public void perform(){
		System.out.println("Collection's size : "+instruments.size());
		Enumeration en=instruments.keys();
		String key;
		while(en.hasMoreElements()){
			key=(String)en.nextElement();
			System.out.println("Key : "+key+" Values : "+instruments.get(key));
		}
	}

	public static void main(String[] args) {
		Resource r=new ClassPathResource("abc.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		SpringColMain band=(SpringColMain)factory.getBean("band");
		band.perform();
	}
}