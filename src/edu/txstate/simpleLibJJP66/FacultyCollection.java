package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FacultyCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Faculty> members;

	public FacultyCollection() {
		members = new ArrayList<Faculty>();
	}
	//adds a new faculty to the list
	public void addFaculty(Faculty newFaculty) {
		members.add(newFaculty);
	}
	
	public void removeFaculty(String name, String ID, int copies) {
		// TODO Auto-generated method stub
		for (int i = 0; i < members.size(); i++) {
			Faculty t = members.get(i);
			if (t.getName().equals(name) && t.getID().equals(ID) && t.getCopies() == copies) {
				members.remove(i);
			}
		}	}

	//prints out ina  readable format
	@Override
	public String toString() {
		String total = "\n";

		for (int i = 0; i < members.size(); i++) {
			Faculty f = members.get(i);
			total = total + f.toString();
		}

		return total;
	}

	//searches for the faculty the user picks
	public String pickFaculty(String input) {
		Boolean search = true;
		Boolean found = false;
		String output = null;
		while (search) {
			for (int i = 0; i < members.size(); i++) {
				Faculty f = members.get(i);
				if (f.getName().equals(input)) {
					output = f.getName();
					found = true;
					search = false;
				}
			}
			if (!found) {
				return "wrong";
			}
		}
		return output;
	}

	//updates the item to borrow
	public void update(String user) {
		for (int i = 0; i < members.size(); i++) {
			Faculty f = members.get(i);
			if (f.getName().equals(user)) {
				f.addCopy();
			}
		}
	}
	//updates the item to return
	public void updateReturn(String user) {
		for (int i = 0; i < members.size(); i++) {
			Faculty f = members.get(i);
			if (f.getName().equals(user)) {
				f.removeCopy();
			}
		}
	}


}
