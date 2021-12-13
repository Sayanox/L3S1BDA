package Command;

import java.util.*;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
	     String i = sc.nextLine();
	     CreateRelationCommand cr = (CreateRelationCommand) CommandSearcher.NewCommand(i);
	     System.out.println(cr.getNbColonne());
	     System.out.println(cr.getNomRelation());
	     for (String s: cr.getNomColonne()) {
	    	 System.out.println(s);
	     }
	     for (String s: cr.getTypeColonne()) {
	    	 System.out.println(s);
	     }*/
		String cmd = "CREATE RELATION R (X:int,C2:float,BLA:string10)";
		Command test = CommandSearcher.NewCommand(cmd);
		System.out.println(test.toString());
	}

}
