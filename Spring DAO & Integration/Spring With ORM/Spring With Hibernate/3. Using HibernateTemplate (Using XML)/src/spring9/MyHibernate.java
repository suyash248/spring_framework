package spring9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyHibernate
{
	public static void main(String args[])
	{
		ApplicationContext context=(ApplicationContext) new ClassPathXmlApplicationContext("spring1.xml");
		ContactDao cdao=(ContactDao)context.getBean("dao");

	try
	{
	
		Contact d=new Contact();
		d.setName("Suyash");
		d.setPhone("983922");
		d.setAddress("Delhi");
		cdao.saveContact(d);
		System.out.println("Data Inserted Successful");
	}catch(Exception e)
		{
			e.printStackTrace();
		}
   }	
}