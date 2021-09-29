package SQL;

import java.util.ArrayList;

public class command {


	public static void add(String param) {
		tempdb.Liste.add(param);
	}

	public static void list() {
		// TODO Auto-generated method stub
		tempdb.Liste.forEach((student) -> display(student));
			
		}

	private static void display(String student) {
		// TODO Auto-generated method stub
		System.out.println("Student Name is " + student);
	}
	

}
