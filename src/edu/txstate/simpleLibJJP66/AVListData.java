package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVListData extends ConsoleWindow{
	public void printMenu() {
		System.out.println(
		"\nEnter 1 to list books" 
		+ "\nEnter 2 to list journals" 
		+ "\nEnter 3 to list students"
		+ "\nEnter 4 to list faculty"
		+ "\nEnter 5 to exit.");
	}
	
	public void aVLDMenuChoice() {
		boolean running = true;	
		while (running) {
			// Call list data menu method to display options
			printMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// List books
						System.out.println("\nReady to list books.");
						listBooks();
						break;
					case 2:
						// List journals
						System.out.println("\nReady to list journals.");
						listJournals();
						break;
					case 3:
						// List Students
						System.out.println("\nReady to list students.");
						listStudents();
						break;
					case 4:
						// List Faculty
						System.out.println("\nReady to list faculty.");
						listFaculty();
						break;
					case 5:
						System.out.println("\nExiting list data menu...");
						running = false;
						break;
					default:
						System.err.println("Please select a number between 1 and 5.");
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
	
	public static void listBooks() {
		// List books
		System.out.println("\nEntered listBooks()");
		
		System.out.println(Data.ListOfBooks.listBookCollection());
	}
	
	public static void listJournals() {
		// List journals
		System.out.println("\nEntered listJournals()");
		
		System.out.println(Data.ListOfJournals.listJournalCollection());
	}
	
	public static void listStudents() {
		// List students
		System.out.println("\nEntered listStudents()");
		
		System.out.println(Data.ListOfStudents.toString());
	}
	
	public static void listFaculty() {
		// List faculty
		System.out.println("\nEntered listFaculty()");
		
		System.out.println(Data.ListOfFaculty.toString());
	}
}
