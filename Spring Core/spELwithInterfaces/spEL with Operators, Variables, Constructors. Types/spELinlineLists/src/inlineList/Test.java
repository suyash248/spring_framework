package inlineList;

import java.util.Iterator;
import java.util.List;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {  
	//private static ApplicationContext appContext;
	
	public static void main(String[] args) {  
		//appContext= new ClassPathXmlApplicationContext("abc.xml");
		ExpressionParser parser = new SpelExpressionParser();  
		
		// RELATIONAL OPERATORS
		boolean trueValue = parser.parseExpression("2 == 2").getValue(Boolean.class);
		boolean falseValue = parser.parseExpression("2 < -5.0").getValue(Boolean.class);
		boolean trueValue1 = parser.parseExpression("'black' < 'block'").getValue(Boolean.class);
		boolean falseValue1 = parser.parseExpression("'xyz' instanceof T(int)").getValue(Boolean.class);
		
		// LOGICAL OPERATORS
		// -- AND --
		boolean falseValue2 = parser.parseExpression("true and false").getValue(Boolean.class);
		// -- OR --
		boolean trueValue2 = parser.parseExpression("true or false").getValue(Boolean.class);
		// -- NOT --
		boolean falseValue3 = parser.parseExpression("!true").getValue(Boolean.class);
		
		// MATHEMATICA OPERATORS
		// Addition
		int two = parser.parseExpression("1 + 1").getValue(Integer.class); // 2
		String testString = parser.parseExpression("'test' + ' ' + 'string'").getValue(String.class); // 'test string'
		// Subtraction
		int four = parser.parseExpression("1 - -3").getValue(Integer.class); // 4
		double d = parser.parseExpression("1000.00 - 1e4").getValue(Double.class); // -900o
		// Multiplication
		int six = parser.parseExpression("-2 * -3").getValue(Integer.class); // 6
		double twentyFour = parser.parseExpression("2.0 * 3e0 * 4").getValue(Double.class); // 24.0
		// Division
		int minusTwo = parser.parseExpression("6 / -3").getValue(Integer.class); // -2
		double one = parser.parseExpression("8.0 / 4e0 / 2").getValue(Double.class); // 1.0
		// Modulus
		int three = parser.parseExpression("7 % 4").getValue(Integer.class); // 3
		int ek = parser.parseExpression("8 / 5 % 2").getValue(Integer.class); // 1
		// Operator precedence
		int minusTwentyOne = parser.parseExpression("1+2-3*8").getValue(Integer.class); // -21
		
		// ASSIGNMENT
		Inventor inventor = new Inventor();
		StandardEvaluationContext inventorContext = new StandardEvaluationContext(inventor);
		parser.parseExpression("Name").setValue(inventorContext, "Suyash");
		// alternatively
		String aleks = parser.parseExpression("Name = 'Suyash'").getValue(inventorContext,String.class);
		
		// TYPES
		Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);
		Class stringClass = parser.parseExpression("T(String)").getValue(Class.class);
		
		// CONSTRUCTOR
		Inventor einstein = parser.parseExpression("new inlineList.Inventor('Albert Einstein','German')").getValue(Inventor.class);
		System.out.println("Inventor's Name : "+einstein.getName()+" Inventor's Nationality : "+einstein.getNationality());
		//create new inventor instance within add method of List
		Society society=new Society();
		EvaluationContext societyContext=new StandardEvaluationContext(society);
		boolean bool=(boolean)parser.parseExpression("Members.add(new inlineList.Inventor('Thomas Adison','American'))").getValue(societyContext);
		Iterator iterator=society.getMembers().iterator();
		Inventor societyInventor=(Inventor)iterator.next();
		System.out.println("Inventor's Name : "+societyInventor.getName()+" Inventor's Nationality : "+societyInventor.getNationality());
		
		// VARIABLE
		Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
		StandardEvaluationContext context = new StandardEvaluationContext(tesla);
		context.setVariable("newName", "Mike Tesla");
		parser.parseExpression("Name = #newName").getValue(context);
		System.out.println(tesla.getName()); // "Mike Tesla"
		
		/*
		 * The #this and #root variables
			The variable #this is always defined and refers to the current evaluation object (against which unqualified
			references are resolved). The variable #root is always defined and refers to the root context object.
			Although #this may vary as components of an expression are evaluated, #root always refers to the root.
		 */
	}
}