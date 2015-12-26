package spEL;

public class CompanyInfo {
	private String cname;
	private String clocation;
	private int cturnover;
	private int cestablishedYear;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	public int getCturnover() {
		return cturnover;
	}
	public void setCturnover(int cturnover) {
		this.cturnover = cturnover;
	}
	
	public String demo(){
		return "Calling instance method demo()";
	}
	
	public String toString(){
		return ("\tCompany Name : "+cname+"\n\tCompany Location : "+clocation+"\n\tCompany Turnover : "+cturnover+"\n\tCompany Established : "+getCestablishedYear());
	}
	public int getCestablishedYear() {
		return cestablishedYear;
	}
	public void setCestablishedYear(int cestablishedYear) {
		this.cestablishedYear = cestablishedYear;
	}
}
