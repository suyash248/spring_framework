package springCollection;

import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringColMain {
	private Map<String, Instrument> instruments;

	public void perform(){
		System.out.println("Collection's size : "+instruments.size());
		for (String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public static void main(String[] args) {
		Resource r=new ClassPathResource("abc.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		SpringColMain band=(SpringColMain)factory.getBean("band");
		band.perform();
	}

	public Map<String, Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
}