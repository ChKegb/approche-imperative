package fr.algorithmie;

import java.util.Scanner;

//Exercices en auto-formation : TABLEAUX, BOUCLES ET CONDITIONS 

public class AffichageIdentite {

	public static void main(String[] args) {
		
		
		
		//Declaration des variables 
		String nom ;
		String prenom;
		//
		Scanner console = new Scanner(System.in) ;
		System.out.println("Veuillez entrer votre nom :" + "\n");
		// saisie du nom par le clavier
		nom=console.next();
		console.nextLine();
		System.out.println("Veuillez entrer votre prenom :"+ "\n");
		// saisie du prenom par le clavier
		prenom=console.next();
		console.nextLine();
		console.close();
		System.out.println("afficher 10 fois votre identité");
		for(int i=0;i<10;i++) {
			//return nom + prenom;
			System.out.println(nom + prenom);
		
		

	}

}
}
