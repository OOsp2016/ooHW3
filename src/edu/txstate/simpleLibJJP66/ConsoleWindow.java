package edu.txstate.simpleLibJJP66;

import java.util.Scanner;

public abstract class ConsoleWindow {

	UserView UV = new UserView();
	
	UVBorrow UVB = new UVBorrow();
	UVReturn UVR = new UVReturn();
	UVSearch UVS = new UVSearch();
	
	protected static Scanner in = new Scanner (System.in);
	
	protected abstract void printMenu();
	
}
