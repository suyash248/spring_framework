import java.util.Iterator;  
import java.util.List;  
  
public class Question {  
private int id;  
private String name;  
private String[] answers;  
  
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String[] getAnswers() {
	return answers;
}

public void setAnswers(String[] answers) {
	this.answers = answers;
}

public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("Array's size :"+answers.length);
    System.out.println("answers are:");  
    for(int i=0;i<getAnswers().length;i++){
    	System.out.println(answers[i]);
    }  
}  
  
}  