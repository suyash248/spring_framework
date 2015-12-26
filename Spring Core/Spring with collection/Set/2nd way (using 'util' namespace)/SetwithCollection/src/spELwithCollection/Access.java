package spELwithCollection;

import java.util.Iterator;
import java.util.List;

public class Access {
	private List<City> chosenCity;	// either use List or Set
	public void show(){
		
		Iterator<City> itr=chosenCity.iterator();
		while(itr.hasNext()){
			City city=itr.next();
			System.out.println("NAME : "+city.getName()+"\nSTATE : "+city.getState()+"\nPOPULATION : "+city.getPopulation()+"\n");
		}
	}


	public List<City> getChosenCity() {
		return chosenCity;
	}
	public void setChosenCity(List<City> chosenCity) {
		this.chosenCity = chosenCity;
	}
}
