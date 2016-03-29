package edu.txstate.simpleLibJJP66;

import java.util.Scanner;

public abstract class ConsoleWindow {

	protected static Scanner in = new Scanner (System.in);
	protected static Scanner search = new Scanner (System.in);
	protected static Scanner remove = new Scanner (System.in);
	protected static Scanner delete = new Scanner (System.in);
	protected static Scanner User = new Scanner (System.in);
	protected static Scanner InputForUser = new Scanner (System.in);
	protected static Scanner bookInput = new Scanner (System.in);
	protected static Scanner journalInput = new Scanner (System.in);
	protected static Scanner DataInput = new Scanner(System.in);
	protected static Scanner DataInput2 = new Scanner(System.in);
	
	static int userType = 0;
	
	protected abstract void printMenu();
	
}
