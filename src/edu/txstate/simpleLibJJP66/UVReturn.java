package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UVReturn extends ConsoleWindow{
	public void printMenu(){
		System.out.println(
				"\nEnter 1 to return a book."
				+ "\nEnter 2 to return a journal."
				+ "\nEnter 3 to exit.");
	}
	
	public void uVReturnMenuChoice(){
		// This method returns an item.
		String book = "";
		String currentUser = "";
		Boolean returning = true;
		// while loop for return options
		while (returning) {
			printMenu();
			try {
				int answer = in.nextInt();

				switch (answer) {
				case 1:
					// returns book
					System.out.println("\nAccepting book.");
					currentUser = UserSelect.userChoiceMenu();
					book = returnBook();
					if (book != null) {
						// if the book is found then the transaction is removed
						userType = Data.ListOfTransactions.removeTransaction(currentUser, book);

						if (userType == 0) {
							// updates the copies
							Data.ListOfStudents.updateReturn(currentUser);
						} else
							// updates the copies
							Data.ListOfFaculty.updateReturn(currentUser);
					}
					break;
				case 2:
					// same as above but for journal
					System.out.println("\nAccepting journal.");
					currentUser = UserSelect.userChoiceMenu();
					book = returnJournal();
					if (book != null) {
						userType = Data.ListOfTransactions.removeTransaction(currentUser, book);
						
						if (userType == 0) {
							Data.ListOfStudents.updateReturn(currentUser);
						} else
							Data.ListOfFaculty.updateReturn(currentUser);
					}
					break;
				case 3:
					System.out.println("\nExiting return menu...");
					returning = false;
					break;
				default:
					System.err
							.println("Please select a number between 1 and 3.");
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

	private static String returnBook() {
		//this allows the user to choose what book to return
		System.out.println("\nEntered returnBook()");
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of book to return: \n");
		String returnItem = in.nextLine();
			bookTransaction = Data.ListOfBooks.returnBook(returnItem);
		}
		return bookTransaction;
	}

	private static String returnJournal() {
		//this allows the user to choose what journal to return
		System.out.println("\nEntered returnJournal()");
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of journal to return: \n");
			String returnItem = in.nextLine();
			bookTransaction = Data.ListOfJournals.returnJournal(returnItem);
		}
		return bookTransaction;
	}
}
