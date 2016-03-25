package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;
import java.util.Scanner;

//test comment change update
// second test comment
public class ConsoleInterface {

	static Scanner InputForUser = new Scanner(System.in);
	static Scanner User = new Scanner(System.in);
	static Scanner Operate = new Scanner(System.in);

	static String CurrentUser = null;
	static int UserType = 0;

	public static void Start() {
		System.out.println("\nWelcome to Julius Perez Library System."
				+ "\nIf there is no serializable file detected, the program will"
				+ "\ngenerate a set of Sample Objects which can be saved later.");
		// calls load data function
		Data.LoadData();

		// calls select user function
		SelectUser();

		// begins library system functions for user.
		LibrarySystem();
	}

	private static void LibrarySystem() {
		// This function will display the menu for the user to operate
		/*
		 * (10) Able to add new users (at least students and faculty) (10)Able
		 * to add new documents (at least journals and books) (10) Able to
		 * perform search on document by author or by title (10) Able to borrow
		 * an item (5) Able to return an item (5) Able to display what are
		 * currently on loan (10) Able to save the library data in either text
		 * or serialized format and reload them back.
		 */
		Boolean Operating = true;
		while (Operating) {
			System.out.println(
					"\nEnter 1 for save and quit." + "\nEnter 2 to add new books, journals, students, and faculty"
							+ "\nEnter 3 to display transactions." + "\nEnter 4 to Search." + "\nEnter 5 to Borrow."
							+ "\nEnter 6 to Return.");
			try {
				int answer = Operate.nextInt();

				switch (answer) {

				case 1:
					// executes save and quitting function
					Data.saveAndQuit();
					Operating = false;
					break;
				case 2:
					// brings you to adding data menu
					Data.addData();
					break;
				case 3:
					// brings you to list data menu
					Data.listData();
					break;
				case 4:
					// brings you to search list menu
					Data.searchLists();
					break;
				case 5:
					// brings you to borrow item menu
					Data.borrowItem(CurrentUser, UserType);
					break;
				case 6:
					// brings you to return item menu
					Data.returnItem(CurrentUser, UserType);
				default:
					System.err.println("Please select a number between 1 and 6.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please Try again." + ex);
				Operate.nextLine(); // clear the new line character from the input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occured." + ex);
			}
		}

	}

	public static void SelectUser() {
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

	// This shows the list of students and allows the user to pick whom to use
	// the system for.
	private static void chooseStudent() {
		CurrentUser = "wrong";
		while (CurrentUser == "wrong") {
			String input = "empty";
			System.out.println(Data.ListOfStudents.toString());
			System.out.println("\nPick user: ");
			input = User.nextLine();
			CurrentUser = Data.ListOfStudents.pickStudent(input);
			if (CurrentUser == "wrong") {
				System.out.println("\nStudent not found! Please enter a valid user name.");
			}
		}
		System.out.println("did pick function");
	}

	// This shows the list of Faculty and allows the user to pick whom to use
	// the system for.
	private static void chooseFaculty() {
		CurrentUser = "wrong";
		while (CurrentUser == "wrong") {
			String input = "empty";

			System.out.println(Data.ListOfFaculty.toString());
			System.out.println("\nPick user: ");
			input = User.nextLine();
			CurrentUser = Data.ListOfFaculty.pickFaculty(input);
			if (CurrentUser == "wrong") {
				System.out.println("\nStudent not found! Please enter a valid user name.");
			}
		}
	}

	// end class
}
