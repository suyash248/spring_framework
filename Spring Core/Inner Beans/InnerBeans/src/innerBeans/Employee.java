package innerBeans;

public class Employee {  
	
	private CompanyInfo companyInfo;  // same for each employee
	private PersonalInfo personalInfo;		// different for each employee. i.e. specific to each employee (should be defined as inner bean)
	
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	
	public void show(){
		System.out.println("PERSONAL INFORMATION : \n"+getPersonalInfo());
		System.out.println("COMPANY INFORMATION : \n"+getCompanyInfo()+"\n");
	}
}  