package spELwithCollection;

public class Access {
	private String selectedProp;

	public String getSelectedProp() {
		return selectedProp;
	}

	public void setSelectedProp(String selectedProp) {
		this.selectedProp = selectedProp;
	}
	
	public void show(){
		System.out.println(getSelectedProp());
	}
}
