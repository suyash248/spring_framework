package spring8;
import javax.servlet.http.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public class MyController extends AbstractController
{
protected ModelAndView handleRequestInternal(HttpServletRequest req,HttpServletResponse res)throws Exception
{
ModelAndView mav=null;
String uname=req.getParameter("uname");
String pwd=req.getParameter("pwd");
if(uname.equals("Ram")&&pwd.equals("Sita"))
{
//String message="Hello Spring";
mav=new ModelAndView("Success");


String message="Hello Spring";

mav.addObject("message",message);

//mav.addObject("message",message);

}
else
{
 mav=new ModelAndView("Failure");


String message="Not a vaild user name and pwd...";

mav.addObject("message",message);


}

return mav;
}
}