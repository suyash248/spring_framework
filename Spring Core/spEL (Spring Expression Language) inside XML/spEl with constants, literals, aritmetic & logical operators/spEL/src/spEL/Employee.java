package spEL;

public class Employee {  

	private String name;
	private int experience;
	private int salary;
	private boolean isActive;
	private CompanyInfo companyInfo;  // same for each employee
	private String common;
	private boolean isMNC;
	private String companyType;
	private String demoOutput;
	
	public void show(){
		System.out.println("EMPLOYEE NAME : "+getName()+"\nEMPLOYEE EXPERIENCE : "+getExperience()+"\nEMPLOYEE SALARY : "+getSalary()+"\nIS ACTIVE : "+getIsActive()+"\nIS MNC : "+getIsMNC()+"\nCOMAPANY TYPE : "+getCompanyType()+"\nCOMPANY INFORMATION : \n"+getCompanyInfo()+"\nCOMMON : "+getCommon()+"\nDemo Output : "+getDemoOutput()+"\n");
	}
	
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
	
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDemoOutput() {
		return demoOutput;
	}

	public void setDemoOutput(String demoOutput) {
		this.demoOutput = demoOutput;
	}

	public boolean getIsMNC() {
		return isMNC;
	}

	public void setIsMNC(boolean isMNC) {
		this.isMNC = isMNC;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
}  