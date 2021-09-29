package SQL;

public class translator {
	public static boolean lecture(String txt) {
		boolean returner= true;
		String cmd = txt.toUpperCase().split(" ")[0];
		String param = txt.substring(cmd.length());
		switch(cmd) {
		  case "ADD":
		    	command.add(param);
		    break;
		  case "LIST":
			    command.list();
			break;
		  case "QUIT":
		    returner = false;
		    break;
		  default:
		    System.out.println("Please enter a valid cmd !");
		}
		return returner;
	}
}
