package CODE;

import java.util.*;

public class RelationInfo {
	private String name;
	private int nbColonnes;
	private String nomColonne;
	private String typeColonne;
	
	public RelationInfo(String n, int nb, String nc, String type) {
		this.name = n;
		this.nbColonnes = nb;
		this.nomColonne = nc;
		switch (type) {
		case "int" :
			this.typeColonne = type;
		case "float" :
			this.typeColonne = type;
		case "stringT" :
			this.typeColonne = type;
		default :
			break;
		}
	}
	
	public String getNomColonne() {
		return nomColonne;
	}
	
	public String getTypeColonne() {
		return typeColonne;
	}
	

}