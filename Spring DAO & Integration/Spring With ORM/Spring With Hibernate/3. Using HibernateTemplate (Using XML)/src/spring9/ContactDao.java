package spring9;
import org.hibernate.SessionFactory;  
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ContactDao
{
	HibernateTemplate template;  
	  
	public void setSessionFactory(SessionFactory factory) {  
	    template=new HibernateTemplate(factory);  
	}  
	  
	public void saveContact(Contact c){  
	    template.save(c);  
	}   
	
}
