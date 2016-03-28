package edu.txstate.simpleLibJJP66;

import java.util.LinkedList;

public interface DocumentSearch {

	void search(String input, BookCollection list);
	
}
/*
class SearchAuthor implements DocumentSearch{
	public void search(){
	}
}*/

class SearchTitle implements DocumentSearch{
	
	public void search(String searchInput, BookCollection list){
		Boolean search = true;
		Boolean found = false;
		String output = null;
		while (search) {

			for (int i = 0; i < ((Object) list).size(); i++) {
				Book TempBook = ((Object) list).get(i);
				// If statement to compare to title and publisher and author
				if (TempBook.getTitle().equals(searchInput)) {
					TempBook.displayBook();
					System.out.println(output);
					found = true;
					// end if statement
				}
				// end for loop
			}
			// if statement to display if book not found
			if (!found) {
				System.out.println("Document not found!");
			}
			search = false;
		}
	}



/*class SearchPublisher implements DocumentSearch{
	public void search(){
	}
}*/
