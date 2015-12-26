package spELwithCollection;

import java.util.Set;

public class Access {
	
	private Set<City> chosenCity;	// Either use Set or List, It is the collection for holding the value(s) corresponding to some key(s).

	public Set<City> getChosenCity() {
		return chosenCity;
	}

	public void setChosenCity(Set<City> chosenCity) {
		this.chosenCity = chosenCity;
	}
	
	public void show(){
		for(City city : getChosenCity()){
			System.out.println("NAME : "+city.getName()+"\nSTATE : "+city.getState()+"\nPOPULATION : "+city.getPopulation());
		}
	}
}
