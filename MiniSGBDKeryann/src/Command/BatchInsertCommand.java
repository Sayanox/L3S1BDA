package Command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BatchInsertCommand extends Command {
	private String nomRelation;
	private int nbRecord;
	private String nomFile;

	public BatchInsertCommand(ArrayList<String> cmd) {
		this.nomRelation = cmd.get(1);
		this.nomFile = cmd.get(4);
	}
	public void toDo() {
		try {
	         File file = new File(nomFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String ligne = "";
	         String[] tempArr;
	         while((ligne = br.readLine()) != null) {
	            tempArr = ligne.split(",");
	            int i = 0;
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
	               InsertCommand.insertion(tempStr);
	               ++i;
	            }
	            System.out.println();
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	}
}
