package shapeMVC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shapeMVC.shapes.Shape;

@Controller
public class ShapeController {
	ModelAndView mav=null;
	@RequestMapping("/aakaar")
	public ModelAndView handleShape(HttpServletRequest req, HttpServletResponse res){
		try{
			String shapeName=req.getParameter("shapeName");
			System.out.println(shapeName);
			Shape shape=null;
			ApplicationContext context=new ClassPathXmlApplicationContext("abc.xml"); 
			
			if(shapeName.toLowerCase().equals("circle")){
				mav=new ModelAndView("circle");		// circle.jsp will be called.
				shape=(Shape)context.getBean("circle");
			}
			else if(shapeName.toLowerCase().equals("triangle")){
				mav=new ModelAndView("triangle");		// triangle.jsp will be called.
				shape=(Shape)context.getBean("triangle");
			}
			else
				mav=new ModelAndView("error");		// error.jsp will be called.
			
			req.setAttribute("shapeBean", shape);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return mav;
	}
}
