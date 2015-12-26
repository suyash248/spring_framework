package spELexpressions;

import java.util.Date;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;
  
public class Test {  
	public static void main(String[] args) {  
		Inventor inventor1 = new Inventor("Suyash", new Date(6,4,1993), "Indian");
		Inventor inventor2 = new Inventor("Abhi", new Date(25,9,1994), "Indian");
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name");	// 'name' property of Inventor class.
		EvaluationContext context = new StandardEvaluationContext(inventor1);		// evaluates to 'Suyash'.... But if you pass 'inventor2' as an argument then it will evaluate to 'Abhi'.
		String name = (String) exp.getValue(context);	// OR		String name=exp.getValue(context,String.class);
		System.out.println(name);
	}
}