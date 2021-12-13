package Command;

import java.util.ArrayList;

public class DeleteCommand extends Command {
	private String nomRelation;
	private int nbCritere;
	private String[] nomColonne;
	private String[] OP;
	private String[] valeur;

	public DeleteCommand(ArrayList<String> cmd) {
		nbCritere = (cmd.size() - 2)/2 ;
		this.nomColonne = new String[nbCritere];
		this.OP =  new String[nbCritere];
		this.valeur = new String[nbCritere];
		this.nomRelation = cmd.get(1);
		for (int i = 0; i<nbCritere;++i) {
			String FullCritere = cmd.get(4 + i*2);
			String[] Critere = FullCritere.split("[=|<|>]");
			nomColonne[i] = Critere[0];
			if(Critere[1] != "")
			valeur[i] = Critere[1];
			else
				valeur[i] = Critere[2];
			OP[i] = FullCritere.substring(nomColonne[i].length(), FullCritere.length() - valeur[i].length());
			
		}

	}

	public void toDo() {
		// Delete une selection
	}

}
