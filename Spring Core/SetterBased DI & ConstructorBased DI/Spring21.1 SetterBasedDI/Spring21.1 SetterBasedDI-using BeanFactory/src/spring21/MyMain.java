package spring21;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyMain {

	public static void main(String[] args) {
		BeanFactory beanfac=new XmlBeanFactory(new ClassPathResource("abc.xml"));
		B b=(B)beanfac.getBean("b");
		A a=b.getAa();
		a.fun();
	}
}
