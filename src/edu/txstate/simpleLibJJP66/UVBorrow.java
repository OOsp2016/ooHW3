package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UVBorrow extends UserView{
	public static void uvBorrowMenu(){
		System.out.println(
				"\nEnter 1 to borrow a book."
				+ "\nEnter 2 to borrow a journal."
				+ "\nEnter 3 to exit.");
	}
	
	public static void uvBorrowMenuChoice(){
		Boolean borrowing = true;
		// this while loop gives the user a menu for what to return
		while (borrowing) {
			uvBorrowMenu();
			try {
				int answer = in.nextInt();
				//int userType = 0;
				switch (answer) {

				case 1:
					// borrows a book for the user
					borrowBook();
					break;
				case 2:
					// same as above but for journal
					borrowJournal();
					break;
				case 3:
					// breaks loop and goes back to previous menu
					borrowing = false;
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

	private static void borrowBook() {
		// allows the user to choose what book to borrow
		String borrow;
		String bookTransaction = "nothing";
		while (bookTransaction == "nothing") {
			System.out.println("\nEnter title of book to borrow: \n");
			borrow= in.nextLine();
			//bookTransaction = lib.Borrow(borrow);
		}
		//return bookTransaction;
	}

	private static void borrowJournal() {
		//allows the user to choose what journal to borrow
		String bookTransaction = "nothing";
		String borrow;
		while (bookTransaction == "nothing") {
			System.out.println("\nEnter title of journal to borrow: \n");
			borrow = in.nextLine();
			//bookTransaction = jour.Borrow(borrow);
		}
		//return bookTransaction;
	}
	
	

}
