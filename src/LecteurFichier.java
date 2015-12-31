import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class LecteurFichier {

	private String nom;
	
	public LecteurFichier(String nom_fichier) {
		this.nom = "C:\\Users\\licence\\" + nom_fichier;	
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		FileInputStream in = null;
		File f = new File("C:\\Users\\licence\\workspace\\Lecteur de fichier\\bin\\fichier.txt");
		*/
		BufferedReader lecteur = null;
		String ligne;
		
		
		LecteurFichier page = new LecteurFichier("fichier.txt");
		
		try {
		/*
		in = new FileInputStream(f); // ouverture du fichier
		// Throws : FileNotFoundException : => try / catch
		
		// OPERATIONS DE LECTURE
		 int data = in.read();
		 */
		 lecteur = new BufferedReader(new FileReader('"' + page.getNom() + '"'));
		 while((ligne = lecteur.readLine()) != null) {
			 System.out.println(ligne);
		 }
		 lecteur.close();
		 } 
		 finally {
			 /*
			 if (in != null)
				 in.close();
			*/
			 
		 }
	}

}