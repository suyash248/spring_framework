package spELwithCollection;

import java.util.Iterator;
import java.util.List;

public class Access {
	private List<String> chosenCity;
	public void show(){
		
		Iterator<String> itr=chosenCity.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());	// +"\nPOPULATION : "+city.getPopulation()
		}
	}
	public List<String> getChosenCity() {
		return chosenCity;
	}
	public void setChosenCity(List<String> chosenCity) {
		this.chosenCity = chosenCity;
	}

}
