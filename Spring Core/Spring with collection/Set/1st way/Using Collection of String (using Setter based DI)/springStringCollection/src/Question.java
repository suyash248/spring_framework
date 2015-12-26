import java.util.Iterator;  
import java.util.List;  
  
public class Question {  
private int id;  
private String name;  
private List<String> answers;  
  
public List<String> getAnswers() {
	return answers;
}

public void setAnswers(List<String> answers) {
	this.answers = answers;
}

public void setId(int id) {
	this.id = id;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("Collection's size :"+answers.size());
    System.out.println("answers are:");  
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }   
}  
  
}  