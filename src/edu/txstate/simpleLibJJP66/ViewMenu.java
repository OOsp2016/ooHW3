package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class ViewMenu extends ConsoleWindow {

	//static Scanner in = new Scanner(System.in);
	
	//top menu for user selections
	protected void printMenu(){
		System.out.println(
				"\n1. Switch to user view. \n"
				+ "2. Switch to librarian view. \n"
				+ "3. Switch to admin view. \n" 
				+ "4. Exit program.");
	}
	
	//begins the program with the top menu
	public void start() {
		Data.LoadData();
		
		//generation of the menu objects
		UserView UV = new UserView();
		LibrarianView LV = new LibrarianView();
		AdminView AV = new AdminView();
		
		int choice = 0;
		boolean exitProgram = false;
		do {
			printMenu();
			try {
				choice = in.nextInt();
				in.nextLine(); // clear the new line character from the input

				switch (choice) {
				case 1:
					// Switch to user view
					UV.uVMenuChoice();
					break;
				case 2:
					// Switch to librarian view
					LV.lVMenuChoice();
					break;
				case 3:
					// Switch to admin view
					AV.aVMenuChoice();
					break;
				case 4:
					//saveAndQuit();
					System.out.println("\nExiting program...");
					Data.saveAndQuit();
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
