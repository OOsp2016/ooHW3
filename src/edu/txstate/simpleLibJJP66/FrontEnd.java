package edu.txstate.simpleLibJJP66;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FrontEnd {

	static Scanner in = new Scanner(System.in);
	
	public static void introMenu(){
		System.out.println(
				"\n1. Switch to user view. \n"
				+ "2. Switch to librarian view. \n"
				+ "3. Switch to Admin view. \n" 
				+ "4. Exit program.");
	}
	
	public static void start() {
		int choice = 0;
		boolean exitProgram = false;
		do {
			introMenu();
			try {
				choice = in.nextInt();
				in.nextLine(); // clear the new line character from the input

				switch (choice) {
				case 1:
					UserView.UVMenuChoice();
					break;
				case 2:
					//switchToLibrarianView();
					break;
				case 3:
					//switchToAdminView();
					break;
				case 4:
					//saveAndQuit();
					exitProgram = true;
					break;
				default:
					System.err
							.println("Please select a number between 1 and 4.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please Try again." + ex);
				in.nextLine(); // clear the new line character from the input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occured." + ex);
			}
		} while (!exitProgram);

	}
}
