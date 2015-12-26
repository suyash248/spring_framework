package spELwithCollection;

import java.util.Map;
import java.util.Set;

public class Access {
	
	private Map<String,City> chosenCity;
	
	public Map<String, City> getChosenCity() {
		return chosenCity;
	}
	public void setChosenCity(Map<String, City> chosenCity) {
		this.chosenCity = chosenCity;
	}
	
	public void show(){
		
		Set<String> keys=getChosenCity().keySet();
		
		for(String key : keys){
			City city=chosenCity.get(key);
			System.out.println("NAME : "+city.getName()+"\nSTATE : "+city.getState()+"\nPOPULATION : "+city.getPopulation()+"\n");
		}
	}
}
