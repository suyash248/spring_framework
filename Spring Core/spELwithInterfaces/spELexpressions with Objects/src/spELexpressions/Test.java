package spELexpressions;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;
  
public class Test {  
	public static void main(String[] args) {  
		Inventor inventor=new Inventor("Suyash","Bhartiya");
		//PlaceOfBirth placeOfBirth=new PlaceOfBirth("Delhi","Bharat");
		
		ExpressionParser parser = new SpelExpressionParser();  
		
		EvaluationContext context=new StandardEvaluationContext(inventor);
		//EvaluationContext context=new StandardEvaluationContext(placeOfBirth);
		
		Expression expression= parser.parseExpression("Birthdate.Year + 1900");
		
		int year=expression.getValue(context,Integer.class);
		
		//String city = (String) parser.parseExpression("placeOfBirth.City").getValue(context);
		System.out.println("Year : "+year);		// evaluates to Year : 2014
		//System.out.println("City : "+city);		// evaluates to City : Delhi
		
	}
}