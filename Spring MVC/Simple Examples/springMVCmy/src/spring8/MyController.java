package spring8;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController{
	@RequestMapping("/control")
	public ModelAndView controllerHandler(HttpServletRequest req, HttpServletResponse res)throws Exception{
		ModelAndView mav=null;
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		if(uname.equals("Suyash")&&pwd.equals("Controller")){
			String message="Hello Spring from controller";
			mav=new ModelAndView("Success","message", message);
		}
		else{
			String message="Not a vaild user name and pwd for controller...";
			mav=new ModelAndView("Failure","message", message);
		}
		return mav;
	}
}