package Command;

public class CreateRelationCommand extends Command{
	private String nomRelation;
	private int nbColonne;
	private String[] nomColonne;
	private String[] typeColonne;

	public CreateRelationCommand(String nomRelation,
	int nbColonne,	String[] nomColonne,String[] typeColonne) {
		this.nomRelation = nomRelation;
		this.nbColonne = nbColonne;
		//recopier dans un nouveau tableau ou reprendre ceux g�n�r�
		this.nomColonne = nomColonne;
		this.typeColonne = typeColonne;
	}
	
	
}
