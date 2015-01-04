package springPrj;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aop {
    public static void main(String... w){
        
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        CustomerService cust=(CustomerService)ctx.getBean("customerServiceProxy");
        
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
