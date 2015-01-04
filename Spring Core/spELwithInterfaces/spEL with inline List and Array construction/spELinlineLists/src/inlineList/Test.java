package inlineList;

import java.util.List;

import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  

public class Test {  
	//private static ApplicationContext appContext;
	
	public static void main(String[] args) {  
		//appContext= new ClassPathXmlApplicationContext("abc.xml");
		ExpressionParser parser = new SpelExpressionParser();  
		
		// Inline List
		List<Integer> numbers = (List<Integer>) parser.parseExpression("{1,2,3,4}").getValue();	
		System.out.println(numbers);
		
		// Empty array construction
		int[] emptyArray = (int[]) parser.parseExpression("new int[4]").getValue();
		System.out.println("Length of emptyArray : "+emptyArray.length );
		
		// Array construction and with some elements in it
		int[] filledArray = (int[]) parser.parseExpression("new int[]{1,2,3}").getValue();
		System.out.print("filledArray contains : ");
		for(int elt : filledArray){
			System.out.print(elt+" ");
		}
		
		// Multi dimensional array
		int[][] numbers3 = (int[][]) parser.parseExpression("new int[4][5]").getValue();
		
	}
}