package spring8;
import javax.servlet.http.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public class MyController1 extends AbstractController
{
protected ModelAndView handleRequestInternal(HttpServletRequest req,HttpServletResponse res)throws Exception
{
ModelAndView mav=new ModelAndView("Success1");
try
{
System.out.println("servletspring executed:");
String message="Hello Spring1";

mav.addObject("message",message);

System.out.println("Servlet Spring  executed 1:");

}catch(Exception e)

{

e.printStackTrace();
}
return mav;
}
}