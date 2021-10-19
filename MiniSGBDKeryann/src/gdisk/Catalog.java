package CODE;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class Catalog implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Catalog INSTANCE;
	
	private List<RelationInfo> listesRelations;
	private int comptRelations;
	
	private Catalog() {
		
	}
	
	public void Finish() throws IOException {
		File fichier = new File("/DB/Catalog.def");
		OutputStream os = new FileOutputStream(fichier);
		ObjectOutputStream oos = new ObjectOutputStream (os);
		oos.writeObject(new Date());
		oos.writeObject(catalog);
		oos.close();
		
		listesRelations.clear();
	    comptRelations = 0;
	}
	
	public void AddRelation(RelationInfo relation) {
		listesRelations.add(relation);
		comptRelations++;
	}
	
	public static Catalog getInstance() {
		return INSTANCE;
	}

}
