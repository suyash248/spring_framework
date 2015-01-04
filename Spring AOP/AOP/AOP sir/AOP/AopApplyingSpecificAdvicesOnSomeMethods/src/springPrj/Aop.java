package springPrj;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aop {
    public static void main(String... w){
        
        ApplicationContext appctx=new ClassPathXmlApplicationContext(new String[] {"spring.config3.xml"});
       
        CustomerService cust=(CustomerService)appctx.getBean("customerServiceProxy");
        
        System.out.println("****");
        cust.printName();
        System.out.println("****");
        cust.showUrl();
        System.out.println("****");
        try{
          //cust.printThrowException();
        }catch(Exception e){}
    }
}
