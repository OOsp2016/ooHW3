package edu.txstate.simpleLibJJP66;
import java.io.Serializable;


public class Faculty implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, ID;
	private int copies;
	
	public Faculty(){
		name = null;
		ID = null;
		copies = 0;
	}
	
	public Faculty(String name, String ID, int copies){
		this.name = name;
		this.ID = ID;
		this.copies = copies;
	}
	//printing format
	@Override
	public String toString(){
		return "\nName: " + name + "\nID: " + ID +
				"\nCopies: " +copies + "\n";
	}
	//returns name
	public String getName(){
		return name;
	}
	
	public String getID(){
		return ID;
	}
	
	public int getCopies(){
		return copies;
	}
	//adds a copy
	public void addCopy(){
		copies+=1;
	}
	//removes a copy
	public void removeCopy(){
		copies-=1;
	}
}
