package CODE;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class Catalog implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String file_path = "/DB/Catalog.def";
	private static Catalog INSTANCE;
	
	private List<RelationInfo> listesRelations;
	private int comptRelations;
	
	private Catalog() {
		
	}
	
	public void Finish() throws IOException {
		OutputStream os = new FileOutputStream(file_path);
		ObjectOutputStream oos = new ObjectOutputStream (os);
		oos.writeObject(new Date());
		for(RelationInfo r : listesRelations) {
			oos.writeObject(r);
		}
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