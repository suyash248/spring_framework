package inlineList;

import java.util.Date;
import java.util.GregorianCalendar;

public class Inventor {
	private String name;
	private String nationality;
	private String[] inventions;
	private Date birthdate;
	
	public Inventor(String name, String nationality){
		GregorianCalendar c= new GregorianCalendar();
		this.name = name;
		this.nationality = nationality;
		this.birthdate = c.getTime();
	}
	public Inventor() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public void setInventions(String[] inventions) {
		this.inventions = inventions;
	}
	
	public String[] getInventions() {
		return inventions;
	}
}