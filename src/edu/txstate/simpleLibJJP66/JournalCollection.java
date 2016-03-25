package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JournalCollection implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9126530822964215794L;
	//creation of new list of Journals
	private static List<Journal> ListOfJournals;
	
	//constructor of list of Journals
	public JournalCollection(){
		ListOfJournals = new ArrayList<Journal>();
	}
	
	//adds a new journal
	public void addJournal(Journal newJournal) {
		ListOfJournals.add(newJournal);
	}
	
	//removes a journal
	public void removeJournal(Journal removeJournal){
		ListOfJournals.remove(removeJournal);
	}
	
	//list all journals in the collection
	public String listJournalCollection() {
		String total = "";
		
		for (int i = 0; i < ListOfJournals.size(); i++) {
			Journal TempJournal = ListOfJournals.get(i);
			total = total + TempJournal.getTitle() + "\n" + TempJournal.getDate() + "\n" + TempJournal.getVolume() + "\n"
					+ TempJournal.getIssue() + "\n" + TempJournal.getPublisher() + "\n" + TempJournal.getCopies() + "\n"
					+ TempJournal.getArticles() + "\n";
 		}
		
		return total;
	}
	
	public void searchJournals(String input){
		Boolean search = true;
		Boolean found = false;
		String output = null;
		
		while (search) {
			
			for (int i = 0; i < ListOfJournals.size(); i++) {
				Journal TempJournal = ListOfJournals.get(i);
				//If statement to compare to title and publisher
				if (TempJournal.getTitle().equals(input) || TempJournal.getPublisher().equals(input)) {
					output = TempJournal.displayJournal();
					System.out.println(output);
					found = true;
					//end if statement
				}
				// end for loop
			}
			//if statement to display if Journal not found
			if (!found) {
				System.out.println("Journal not found!");
			}
			search = false;
		}
	}
	// end class

	public String Borrow(String borrow) {
		boolean found = false;
		String borrowedJournal = null;
		for (int i = 0; i < ListOfJournals.size(); i++) {
			Journal j = ListOfJournals.get(i);
			if (j.getTitle().equals(borrow)) {
				found = true;
				j.updateBorrow();
				borrowedJournal=j.getTitle();
			}
		}
		if (!found) {
			System.out.println("Journal not found!");
			return "nothing";
		}
		return borrowedJournal;
	}

	public String returnJournal(String returnItem) {
		boolean found = false;
		String returnedJournal = null;
			for (int i = 0; i < ListOfJournals.size(); i++) {
				Journal j = ListOfJournals.get(i);
				if (j.getTitle().equals(returnItem)) {
					found = true;
					j.updateReturn();
					returnedJournal=j.getTitle();
				}
			}
			if(!found){
				System.out.println("Journal not found!");
				return "nothing";
			}
			return returnedJournal;
	}
	//end class
}
