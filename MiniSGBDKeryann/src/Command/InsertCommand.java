package Command;

import java.util.ArrayList;

public class InsertCommand extends Command {
	private String nomTable;
	private int nbRecord;
	private String[] Records;

	public InsertCommand(ArrayList<String> cmd) {
		nbRecord = 0;
		this.nomTable = cmd.get(1);
		String col = cmd.get(3).substring(1, cmd.get(3).length() - 1);
		int i = col.split(",").length;
		Records = new String[i];
		for (String colonne : col.split(",")) {
			Records[nbRecord] = colonne;
			++nbRecord;
		}
	}
	public void toDo() {
		//insert cet objet dans la bd
	}
	
	public static void insertion(String tempStr) {//a voir
		
	}
}
