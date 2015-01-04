package spring8;
import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController1{
	@RequestMapping("/control1")
	public ModelAndView controllerHandler1(HttpServletRequest req, HttpServletResponse res)throws Exception{
		ModelAndView mav=null;
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		if(uname.equals("Suyash")&&pwd.equals("Controller1")){
			String message="Hello Spring from controller-1";
			mav=new ModelAndView("Success1","message", message);
		}
		else{
			String message="Not a vaild user name and pwd for controller1...";
			mav=new ModelAndView("Failure","message", message);
		}
		return mav;
	}
}