package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UserSelect extends ConsoleWindow{
	
	private static String currentUser = "";
	private static int UserType;

	public void printMenu(){
		System.out.println("\nChoose User: " 
					+ "\nEnter 1 for Student" 
					+ "\nEnter 2 for Faculty");
	}
	
	public void userChoiceMenu() {
		// This function allows the user to choose whom they are altering
		Boolean Choosing = true;

		// while the user is choosing, allow user to determine to search through
		// list of
		// students and faculty
		while (Choosing) {
			System.out.println("\nChoose user: " + "\nEnter 1 for Student." + "\nEnter 2 for Faculty");
			try {
				int choice = InputForUser.nextInt();
				switch (choice) {
				case 1:
					chooseStudent();
					UserType = 0;
					break;
				case 2:
					chooseFaculty();
					UserType = 1;
					break;
				default:
					System.err.println("Please select a number between 1 and 2.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please Try again." + ex);
				InputForUser.nextLine(); // clear the new line character from
											// the input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occured." + ex);
			}
			Choosing = false;
		}
	}
		
		private static void chooseStudent() {
			while (currentUser == "") {
				String input = "empty";
				System.out.println(Data.ListOfStudents.toString());
				System.out.println("\nPick user: ");
				input = User.nextLine();
				currentUser = Data.ListOfStudents.pickStudent(input);
				if (currentUser == "wrong") {
					System.out.println("\nStudent not found! Please enter a valid user name.");
				}
			}
			System.out.println("did pick function");
		}

		// This shows the list of Faculty and allows the user to pick whom to use
		// the system for.
		private static void chooseFaculty() {
			currentUser = "wrong";
			while (currentUser == "wrong") {
				String input = "empty";

				System.out.println(Data.ListOfFaculty.toString());
				System.out.println("\nPick user: ");
				input = User.nextLine();
				currentUser = Data.ListOfFaculty.pickFaculty(input);
				if (currentUser == "wrong") {
					System.out.println("\nStudent not found! Please enter a valid user name.");
				}
			}
		}
}
