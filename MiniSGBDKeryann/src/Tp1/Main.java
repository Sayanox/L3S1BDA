package Tp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void lireDepuisFichier(ArrayList<String> liste) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("personnes.txt"));

			String line;

			while ((line = reader.readLine()) != null) {
				liste.add(line);
			}
			reader.close();

		} catch (IOException e) {
			System.out.println("Pas de fichier! Ce n'est pas grave ... : )");
		}
	}

	public static void ecrireDansFichier(ArrayList<String> liste) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("personnes.txt", false));

			for (int i = 0; i < liste.size(); ++i) {
				writer.write(liste.get(i));
				writer.write("\n");
				;
			}

			writer.close();

		} catch (IOException e) {
			System.out.println("La sauvegarde s'est mal passée...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ArrayList<String> personnes = new ArrayList<String>();

		lireDepuisFichier(personnes);

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Coucou, que veux-tu faire?");

			String commande = scanner.nextLine();

			if (commande.equals("QUIT")) {
				System.out.println("au revoir!");
				break;
			}

			String[] mots = commande.split(" ");

			switch (mots[0]) {

			case "LIST":
				System.out.println("===");
				System.out.println("Voici la liste des personnes:");
				System.out.println("===");
				for (String p : personnes)
					System.out.println(p);
				// ou alors: for (int i = 0; i < liste.size(); ++i)
				// System.out.println(liste.get(i));

				break;

			case "ADD":
				personnes.add(mots[1]);
				break;

			default:
				System.out.println("mauvaise commande");
				break;
			}
		}

		scanner.close();

		ecrireDansFichier(personnes);

	}

}