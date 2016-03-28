package edu.txstate.simpleLibJJP66;

public class TestBooks {
	static BookCollection ListOfBooks = new BookCollection();
	
	public static void StartTests(){
		//TestBookOne
				Book TestBookOne = new Book();
				//Test to add books to a list. 
				ListOfBooks.addBook(TestBookOne);
				
				//Test Display of TestBookOne
				System.out.println("***Test Display TestBookOne***");
				System.out.println(TestBookOne.getTitle());
				System.out.println(TestBookOne.getPublisher());
				System.out.println(TestBookOne.getDate());
				System.out.println(TestBookOne.getISBN());
				System.out.println(TestBookOne.getCopies());
				System.out.println(TestBookOne.getAuthors());
				
				//Test to add another Author to TestBookOne
				System.out.println("***Test adding an Author***");
				System.out.println(TestBookOne.getTitle());
				System.out.println(TestBookOne.getPublisher());
				System.out.println(TestBookOne.getDate());
				System.out.println(TestBookOne.getISBN());
				System.out.println(TestBookOne.getCopies());
				TestBookOne.addAnAuthor("SecondFirstName");

				System.out.println(TestBookOne.getAuthors());

				
				//Test to remove Author from TestBookOne
				System.out.println("***Test for removing an Author***");
				System.out.println(TestBookOne.getTitle());
				System.out.println(TestBookOne.getPublisher());
				System.out.println(TestBookOne.getDate());
				System.out.println(TestBookOne.getISBN());
				System.out.println(TestBookOne.getCopies());
				TestBookOne.removeAnAuthor("SecondFirstName");
				System.out.println(TestBookOne.getAuthors());	
				
				//Test to add second book with specific parameters
				Book TestBookTwo = new Book("1984", "Harvill Secker", "June 8, 1949", "4313241", 1, "George Orwell");
				
				ListOfBooks.addBook(TestBookTwo);
				
				System.out.println("***Test Display TestBookTwo***");
				System.out.println(TestBookTwo.getTitle());
				System.out.println(TestBookTwo.getPublisher());
				System.out.println(TestBookTwo.getDate());
				System.out.println(TestBookTwo.getISBN());
				System.out.println(TestBookTwo.getCopies());
				System.out.println(TestBookTwo.getAuthors());

				//Test to display multiple books from the ListOfBooks
				System.out.println("***Test Display ListOfBooks***");
				System.out.println(ListOfBooks.listBookCollection());
				
				//Test to add authors to book one and two and see if they display correctly
				System.out.println("***Test Display ListOfBooks with multiple Authors***");
				TestBookOne.addAnAuthor("Bob Sagget");
				TestBookTwo.addAnAuthor("John Jacob");
				System.out.println(ListOfBooks.listBookCollection());
				
				//Test to search ListOfBooks and display specified book
				System.out.println("***Test search for book***");
				ListOfBooks.searchBooks("1984");
				ListOfBooks.searchBooks("Default Publisher");
				
				//Test to search ListOfBooks by Author
				System.out.println("***Test search by Author***");
				ListOfBooks.searchBooks("George Orwell");
				ListOfBooks.searchBooks("John Jacob");
				ListOfBooks.searchBooks("Bob Sagget");

	}
	//end class
}
