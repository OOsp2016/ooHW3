package edu.txstate.simpleLibJJP66;

public interface DocumentSearch {

	void search();
	
}

class SearchAuthor implements DocumentSearch{
	public void search(){
	}
}

class SearchTitle implements DocumentSearch{
	public void search(){
		Boolean search = true;
		Boolean found = false;
		String output = null;
		while (search) {

			for (int i = 0; i < ListOfBooks.size(); i++) {
				Book TempBook = ListOfBooks.get(i);
				// If statement to compare to title and publisher and author
				if (TempBook.getTitle().equals(input) || TempBook.getPublisher().equals(input)
						|| TempBook.findAuthor(input) == true) {
					output = TempBook.displayBook();
					System.out.println(output);
					found = true;
					// end if statement
				}
				// end for loop
			}
			// if statement to display if book not found
			if (!found) {
				System.out.println("Book not found!");
			}
			search = false;
		}
	}
}

class SearchPublisher implements DocumentSearch{
	public void search(){
	}
}
