package spELexpressions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
//import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;
  
public class Test {  
	private static ApplicationContext appContext;
	
	public static void main(String[] args) {  
		appContext= new ClassPathXmlApplicationContext("abc.xml");
		ExpressionParser parser = new SpelExpressionParser();  
		
		// Dealing with arrays.
		Inventor inventor=(Inventor)appContext.getBean("inventorSuyash");
		EvaluationContext inventorContext=new StandardEvaluationContext(inventor);
		String invention = parser.parseExpression("inventions[2]").getValue(inventorContext,String.class);
		System.out.println("Invention : "+invention);
		
		
		// Dealing with Collection i.e. Map.
		Society society=(Society)appContext.getBean("society");
		EvaluationContext societyContext=new StandardEvaluationContext(society);
		String officerName =parser.parseExpression("Officers[102]").getValue(societyContext,String.class);
		System.out.println("Officer's Name : "+officerName);
	}
}