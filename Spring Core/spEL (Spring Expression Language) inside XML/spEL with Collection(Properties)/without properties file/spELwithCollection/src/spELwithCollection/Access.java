package spELwithCollection;

public class Access {
	
	private String chosenCity;	// Either use Set or List, It is the collection for holding the value(s) corresponding to some key(s).

	public void show(){
			System.out.println("STATE : "+getChosenCity());
	}

	public String getChosenCity() {
		return chosenCity;
	}

	public void setChosenCity(String chosenCity) {
		this.chosenCity = chosenCity;
	}
}
