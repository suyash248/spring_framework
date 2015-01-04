package innerBeans;

public class PersonalInfo {  
	
	private String ename;
	private String eaddress;
	private int esalary;
	private int ephone;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEphone() {
		return ephone;
	}
	public void setEphone(int ephone) {
		this.ephone = ephone;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public String toString(){
		return ("Employee Name : "+ename+"\nEmployee Address : "+eaddress+"\nEmployee Salary : "+esalary+"\nEmployee Phone : "+ephone);
	}	// "\nEmployee Phone : "+ephone+
}  