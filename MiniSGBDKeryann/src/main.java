import java.util.ArrayList;
import gdisk.*;
import java.util.Scanner;

import Command.*;
import SQL.*;

public class main {
	final static String Exit = "EXIT";
	static boolean ending = true;
	public static void main(String[] args) {
		gdisk.dbparams.DBPath = "C:\\BD";
		gdisk.dbparams.pageSize = 4096;
		gdisk.dbparams.maxPagesPerFile = 4;
		gdisk.dbparams.currPage = 0;
		gdisk.dbparams.currFile = 0;
		gdisk.dbparams.frameCount = 2;
		// TODO Auto-generated method stub
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Welcome to the mini SGBD: ");
	    
		while(ending) {
			String input = myObj.nextLine();
			if(input.toUpperCase().equals(Exit)){
				ending = false;
				//DBManager finish
			}else {
				Command cmd = CommandSearcher.NewCommand(input);
				cmd.toDo();
			}
			
		}
		System.out.print("bye, monde!");
			
			
	}

}
