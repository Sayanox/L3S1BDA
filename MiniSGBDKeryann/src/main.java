import java.util.ArrayList;
import gdisk.*;
import java.util.Scanner;
import SQL.*;

public class main {
	
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
	    System.out.println("Welcome the the mini SGBD: ");
	    
		while(ending) {
			String input = myObj.nextLine();
			ending = SQL.translator.lecture(input);
		}
		System.out.print("bye, monde!");
			
			
	}

}
