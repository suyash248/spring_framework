package spel;

import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {  
	//private static ApplicationContext appContext;
	
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		try {
			context.registerFunction("myReverseString",MyStringUtils.class.getDeclaredMethod("myReverseString",new Class[] { String.class }));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		String reversed =parser.parseExpression("#myReverseString('hello')").getValue(context, String.class);
		System.out.println("Reversed String is : "+reversed);	// olleh
	}
}