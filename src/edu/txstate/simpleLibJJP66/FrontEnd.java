package edu.txstate.simpleLibJJP66;

import java.util.Scanner;

public class FrontEnd {

	static Scanner in = new Scanner(System.in);
	
	public static void introMenu(){
		System.out.println(
				"\n1. Switch to user view. \n"
				+ "2. Switch to librarian view. \n"
				+ "3. Switch to Admin view. \n" 
				+ "4. Exit program.");
	}
}
