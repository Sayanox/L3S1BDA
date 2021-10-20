package CODE;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class Catalog implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Catalog INSTANCE;
	
	private static List<RelationInfo> listesRelations;
	private static int comptRelations;
	
	private Catalog() {
		
	}
	
	public void Init() throws IOException {
		String n, nc, type;
		int nb;
		final String ESPACE = " ";
		
		FileReader fr = new FileReader("/DB/Catalog.def");
		BufferedReader br = new BufferedReader (fr);
		StringBuffer sb = new StringBuffer ();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
			sb.append("/n");
		}
		String params[] = (sb.toString()).split(ESPACE);
		n = params[0];
		nb = Integer.parseInt(params[1]);
		nc = params[2];
		type = params[3];
		this.AddRelation(new RelationInfo(n, nb, nc, type));
		this.setComptRelations(Integer.parseInt(params[4]));
		
	}
	
	public static void Finish() throws IOException {
		File fichier = new File("/DB/Catalog.def");
		OutputStream os = new FileOutputStream(fichier);
		ObjectOutputStream oos = new ObjectOutputStream (os);
		//oos.writeObject(this);
		oos.close();
		
		listesRelations.clear();
	    try {
			comptRelations = 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AddRelation(RelationInfo relation) {
		listesRelations.add(relation);
		comptRelations++;
	}
	
	public void setComptRelations(int i) {
		this.comptRelations = i;
	}

	
	public static Catalog getInstance() {
		return INSTANCE;
	}

}