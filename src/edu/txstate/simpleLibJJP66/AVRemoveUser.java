package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVRemoveUser extends ConsoleWindow{
	public void printMenu() {
		System.out.println(
		"\nEnter 1 to remove student" 
		+ "\nEnter 2 to remove faculty member" 
		+ "\nEnter 3 to exit");
	}
	
	public void aVRUMenuChoice() {
		boolean running = true;	
		while (running) {
			// Call remove user menu method to display options
			printMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Remove student
						System.out.println("\nReady to remove student.");
						removeStudent();
						break;
					case 2:
						// Remove faculty
						System.out.println("\nReady to remove faculty.");
						removeFaculty();
						break;
					case 3:
						System.out.println("\nExiting remove user menu...");
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
	
	public static void removeStudent() {
		// Remove new student
		System.out.println("\nEntered removeStudent()");
		
		// adds a student by info.
		String name, ID;

		System.out.println("\nEnter Name: ");
		name = remove.nextLine();

		System.out.println("\nEnter ID: ");
		ID = remove.nextLine();

		Data.ListOfStudents.removeStudent(name, ID);
	}
	
	public static void removeFaculty() {
		// Remove new faculty
		System.out.println("\nEntered removeFaculty()");
		
		String name, ID;

		System.out.println("\nEnter Name: ");
		name = delete.nextLine();

		System.out.println("\nEnter ID: ");
		ID = delete.nextLine();

		Data.ListOfFaculty.removeFaculty(name, ID);
	}
	
}
