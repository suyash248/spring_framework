package inlineList;

import java.util.*;

public class Society {
	
	private List<Inventor> members = new ArrayList<Inventor>();
	private Map<Integer,String> officers = new HashMap<Integer,String>();		// key- id, value- name

	public boolean isMember(String name){
		boolean found = false;
		for (Inventor inventor : members) {
			if (inventor.getName().equals(name)){
				found = true;
				break;
			}
		}
		return found;
	}
	
	public List<Inventor> getMembers() {
		return members;
	}

	public void setMembers(List<Inventor> members) {
		this.members = members;
	}

	public Map<Integer,String> getOfficers() {
		return officers;
	}
	public void setOfficers(Map<Integer,String> officers) {
		this.officers = officers;
	}
}