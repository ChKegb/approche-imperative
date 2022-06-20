package fr.algorithmie;

import java.util.Scanner;

//Exercices en auto-formation : TABLEAUX, BOUCLES ET CONDITIONS 

public class AffichageIdentite {
	
	/*
	public String identite(String nom,String prenom) {
		// Pour efffectuer de saisie au sein de proramme
		//Scanner console = new Scanner(System.in) ;
		///System.out.println("Veuillez entrer votre nom");
		nom=console.next();
		console.nextLine();
		System.out.println("Veuillez entrer votre prenom");
		prenom=console.next();
		console.close();
		for(int i=0;i<10;i++) {
			return nom + prenom;
		}
		
	}*/

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
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
		for(int i=0;i<10;i++) {
			//return nom + prenom;
			System.out.println(nom + prenom);
		
		

	}

}
}
