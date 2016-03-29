package edu.txstate.simpleLibJJP66;

import java.util.LinkedList;

//failed implementation of strategy pattern. 

public interface DocumentSearch {

	void search(String input);
	
}
/*
class SearchAuthor implements DocumentSearch{
	public void search(){
	}
}*/

class SearchTitle implements DocumentSearch{
	
	public void search(String searchInput){
		Boolean search = true;
		Boolean found = false;
		String output = null;
		while (search) {

			for (int i = 0; i < BookCollection.LinkList.size(); i++) {
				Book TempBook = BookCollection.LinkList.get(i);
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
}


/*class SearchPublisher implements DocumentSearch{
	public void search(){
	}
}*/
