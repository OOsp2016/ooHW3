package edu.txstate.simpleLibJJP66;
import java.io.Serializable;
//nearly identical to faculty provides same functions but student specific.

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, ID;
	private int copies;
	
	public Student(){
		name = null;
		ID = null;
		copies = 0;
	}
	
	public Student(String name, String ID, int copies){
		this.name = name;
		this.ID = ID;
		this.copies = copies;
	}
	
	@Override
	public String toString(){
		return "\nName: " + name + "\nID: " + ID +
				"\nCopies: " +copies + "\n";
	}
	
	public String getName(){
		return name;
	}
	
	public String getID(){
		return ID;
	}
	
	public int getCopies(){
		return copies;
	}
	
	
	public void addCopy(){
		copies+=1;
	}
	
	public void removeCopy(){
		copies-=1;
	}
}
