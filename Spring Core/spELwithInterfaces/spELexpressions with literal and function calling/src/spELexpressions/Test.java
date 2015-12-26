package spELexpressions;

import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
  
public class Test {  
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		// string literal
		Expression exp1 = parser.parseExpression("'Hello SPEL'");  
		String val1 = exp1.getValue(String.class);  // OR  String message = (String)exp.getValue();
		System.out.println(val1);  
		
		// calling funtion
		Expression exp2 = parser.parseExpression("'Hello SPEL'.length()");  
		int val2 = exp2.getValue(Integer.class);  // OR  int message = (Integer)exp.getValue();
		System.out.println(val2); 
		
		Expression exp3 = parser.parseExpression("null");  
		Object val3 = exp3.getValue(); 
		System.out.println(val3); 
	}
}