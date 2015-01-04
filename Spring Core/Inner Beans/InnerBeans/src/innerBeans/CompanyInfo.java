package innerBeans;

public class CompanyInfo {
	private String cname;
	private String clocation;
	private int cturnover;
	
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
	
	public String toString(){
		return ("Company Name : "+cname+"\nCompany Location : "+clocation+"\nCompany Turnover : "+cturnover);
	}
}
