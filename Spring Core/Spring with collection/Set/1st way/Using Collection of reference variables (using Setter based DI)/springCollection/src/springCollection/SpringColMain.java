package springCollection;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringColMain {
	private List<Instrument> instruments;
	
	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	public List<Instrument> getInstruments() {			// <Instrument>
		return instruments;
	}

	public void perform(){
		System.out.println("Collection's size : "+instruments.size());
		for(Instrument instrument : getInstruments()){
			System.out.println(instrument);
			instrument.play();
		}
	}
	
	public static void main(String[] args) {
		Resource r=new ClassPathResource("abc.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		SpringColMain band=(SpringColMain)factory.getBean("band");
		band.perform();
	}
}