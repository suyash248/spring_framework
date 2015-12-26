import java.util.Iterator;  
import java.util.List;  
  
public class Question {  
private int id;  
private String name;  
private String[] answers;  
  
public Question() {}  
public Question(int id, String name, String[] answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("Array's size :"+answers.length);
    System.out.println("answers are:");  
    for(int i=0;i<answers.length;i++){
    	System.out.println(answers[i]);
    }  
}  
  
}  