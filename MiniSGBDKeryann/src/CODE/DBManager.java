package CODE;

import java.io.IOException;
import java.util.Scanner;

import gdisk.BufferManager;

public class DBManager {
	private  Catalog catal;
	private static DBManager instance = new DBManager();

	public DBManager() {
		try {
			catal = new Catalog();
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
	public static void ProcessCommand(String cmd) throws IOException {
		
		String cmdat0 = cmd.toUpperCase().trim().split(" ")[0];
		switch (cmdat0) {
		case "1":
			break;
		case "2":
			break;
		case "EXIT":
			
			break;
		default:
			System.out.println("Please enter a valid cmd !");
		}
		
	}

	
	public void init() throws IOException {
		catal.Init();
	}
	public void Finish(BufferManager buff) throws IOException {
		buff.FlushAll();
		
			try {
				catal.Finish();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
