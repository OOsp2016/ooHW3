package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//check faculty functions, nearly identicle just specific to students
public class StudentCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Student> students;

	public StudentCollection() {
		students = new ArrayList<Student>();
	}

	public void addStudent(Student newStudent) {
		students.add(newStudent);
	}

	public void removeStudent(String name, String ID) {
		// TODO Auto-generated method stub
			for (int i = 0; i < students.size(); i++) {
				Student t = students.get(i);
				if (t.getName().equals(name) && t.getID().equals(ID)) {
					students.remove(i);
				}
			}
			
		}
	

	@Override
	public String toString() {
		String total = "\n";

		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			total = total + s.toString();
		}

		return total;
	}

	public String pickStudent(String input) {
		Boolean search = true;
		Boolean found = false;
		String output = null;
		while (search) {			
			for (int i = 0; i < students.size(); i++) {
				Student s = students.get(i);
				if (s.getName().equals(input)) {
					output = s.getName();
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

	public void update(String user) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getName().equals(user)) {
				s.addCopy();
			}
		}
	}

	public void updateReturn(String user) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getName().equals(user)) {
				s.removeCopy();
			}
		}
	}

}
