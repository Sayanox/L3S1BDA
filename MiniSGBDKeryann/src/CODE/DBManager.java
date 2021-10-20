package CODE;

import java.io.IOException;
import java.util.Scanner;

import gdisk.BufferManager;

public class DBManager {
	private static DBManager instance = new DBManager();

	public DBManager() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static DBManager getInstance(String value) {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	public static boolean UtilMenu(BufferManager buff, Catalog cata) throws IOException {
		boolean returner = true;
		Scanner myObj = new Scanner(System.in);
		myObj.reset();
		System.out.println("Enter cmd"+ System.lineSeparator() + "=>");
		String input = myObj.nextLine();
		String cmd = input.toUpperCase().trim().split(" ")[0];
		int a, b, c;
		double note;
		switch (cmd) {
		case "1":
			break;
		case "PROCESSCOMMAND":
			break;
		case "EXIT":
			returner = false;
			Finish(buff,cata);
			break;
		default:
			System.out.println("Please enter a valid cmd !");
		}
		myObj.close();
		return returner;
	}

	public static void Menu() throws IOException {

		System.out.println("Welcome: ");
		boolean ending = true;
		while (ending) {

			ending = UtilMenu(null, null);
		}
		System.out.print("bye, monde!");

	}
	public void init() {
		//init du catalog
	}
	public static void Finish(BufferManager buff, Catalog cata) throws IOException {
		buff.FlushAll();
		cata.Finish();
	}

}
