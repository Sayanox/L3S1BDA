package Command;

import java.util.ArrayList;

public class CreateRelationCommand extends Command {
	private String nomRelation;
	private int nbColonne;
	private String[] nomColonne;
	private String[] typeColonne;

	public CreateRelationCommand(ArrayList<String> cmd) {
		nbColonne = 0;
		this.nomRelation = cmd.get(0);
		String col = cmd.get(1).substring(1, cmd.get(1).length() - 1);
		int i = col.split(",").length;
		nomColonne = new String[i];
		typeColonne = new String[i];
		for (String colonne : col.split(",")) {
			nomColonne[nbColonne] = colonne.split(":")[0];
			typeColonne[nbColonne] = colonne.split(":")[1];
			++nbColonne;
		}

	}

	public String getNomRelation() {
		return nomRelation;
	}

	public String[] getNomColonne() {
		return nomColonne;
	}

	public String[] getTypeColonne() {
		return typeColonne;
	}

	public int getNbColonne() {
		return nbColonne;
	}
	
	//toString utilisé pour test
	public String toString() {
		return nomRelation + " " + nbColonne + " " + typeColonne[0] + " " + nomColonne[0] + typeColonne[1] + " " + nomColonne[1]+ typeColonne[2] + " " + nomColonne[2];
	}
	public void toDO() {
		
	}

}
