package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UVReturn extends UserView{

	public static void uvReturnMenu(){
		System.out.println(
				"\nEnter 1 to return a book."
				+ "\nEnter 2 to return a journal."
				+ "\nEnter 3 to exit.");
	}
	
	public static void uvReturnMenuChoice(){
		// This method returns an item.
		String book = "";
		Boolean returning = true;
		// while loop for return options
		while (returning) {
			uvReturnMenu();
			try {
				int answer = in.nextInt();

				switch (answer) {
				case 0:
					System.out.println("\nExiting return menu...");
					returning = false;
					break;
				case 1:
					// returns book
					System.out.println("\nAccepting book.");
					book = returnBook();
					/*if (book != null) {
						// if the book is found then the transaction is removed
						trans.removeTransaction(currentUser, book);
						if (userType == 0) {
							// updates the copies
							stu.updateReturn(currentUser);
						} else
							// updates the copies
							fac.updateReturn(currentUser);
					}*/
					break;
				case 2:
					// same as above but for journal
					System.out.println("\nAccepting journal.");
					book = returnJournal();
					/*if (book != null) {
						trans.removeTransaction(currentUser, book);
						if (userType == 0) {
							stu.updateReturn(currentUser);
						} else
							fac.updateReturn(currentUser);
					}*/
					break;
				default:
					System.err
							.println("Please select a number between 0 and 2.");
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
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of book to return: \n");
			String returnItem = in.nextLine();
			//bookTransaction = lib.Return(returnItem);
		}
		return bookTransaction;
	}

	private static String returnJournal() {
		//this allows the user to choose what journal to return
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of journal to return: \n");
			String returnItem = in.nextLine();
			//bookTransaction = jour.Return(returnItem);
		}
		return bookTransaction;
	}
}
