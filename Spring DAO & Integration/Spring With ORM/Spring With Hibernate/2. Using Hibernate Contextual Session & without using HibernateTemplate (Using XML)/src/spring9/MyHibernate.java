package spring9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyHibernate
{
	public static void main(String args[])
	{
	ApplicationContext context=(ApplicationContext) new ClassPathXmlApplicationContext("spring1.xml");
	SessionFactory sf=(SessionFactory)context.getBean("mySessionFactory");

	try
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Contact d=new Contact();
		d.setName("Abhi");
		d.setPhone("90383");
		d.setAddress("London");
		session.save(d);
		tx.commit();
		System.out.println("Data Inserted Successful");
	}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	