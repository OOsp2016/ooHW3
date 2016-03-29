package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class LVAddDocument extends ConsoleWindow{
	public void printMenu() {
		System.out.println(
				"\nEnter 1 to add a new book" 
				+ "\nEnter 2 to add a new journal" 
				+ "\nEnter 3 to exit.");
	}
	
	public void lVADMenuChoice() {
		boolean running = true;	
		while (running) {
			// Call lvAdMenu method to display options
			printMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Add new book
						System.out.println("\nReady to add new book.");
						addBook();
						break;
					case 2:
						// Add new journal
						System.out.println("\nReady to add new journal.");
						addJournal();
						break;
					case 3:
						System.out.println("\nExiting librarian view...");
						running = false;
						break;
					default:
						System.err.println("Please select a number between 1 and 3.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please Try again." + ex);
				in.nextLine(); // clear the new line character from the input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occured." + ex);
			}
		}
	}
	
	public static void addBook() {
		int copies;
		String isbn, title, publisher, date, authorName;

		System.out.println("\nEnter title: ");
		title = bookInput.nextLine();

		System.out.println("\nEnter Publisher: ");
		publisher = bookInput.nextLine();

		System.out.println("\nEnter Date: ");
		date = bookInput.nextLine();

		System.out.println("\nEnter ISBN: ");
		isbn = bookInput.nextLine();

		System.out.println("\nEnter Copies: ");
		copies = bookInput.nextInt();

		System.out.println("\nEnter Author First Name: ");
		authorName = bookInput.nextLine();

		Book addingBook = new Book(title, publisher, date, isbn, copies, authorName);
		Data.ListOfBooks.addBook(addingBook);

	}

	public static void addJournal() {
		// this method allows the user to enter information for journal
		String title, publisherDate, publisher, article;
		int copies, volume, issue;

		System.out.println("\nEnter Title: ");
		title = journalInput.nextLine();

		System.out.println("\nEnter Publisher Date: ");
		publisherDate = journalInput.nextLine();

		System.out.println("\nEnter Volume: ");
		volume = journalInput.nextInt();

		System.out.println("\nEnter Issue: ");
		issue = journalInput.nextInt();

		System.out.println("\nEnter Copies: ");
		copies = journalInput.nextInt();

		System.out.println("\nEnter Publisher: ");
		publisher = journalInput.nextLine();

		System.out.println("\nEnter Article: ");
		article = journalInput.nextLine();

		Journal addingJournal = new Journal(title, publisherDate, volume, issue, publisher, copies, article);
		Data.ListOfJournals.addJournal(addingJournal);
	}
}
