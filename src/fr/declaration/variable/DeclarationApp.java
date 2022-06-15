package fr.declaration.variable;

import java.util.Scanner;

// TP3 les declarations 
public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// pour ecrire dans java
		Scanner console = new Scanner(System.in);
		System.out.println("Veuillez rentrer un entier i");
		int i=console.nextInt();
		// pour passer � la ligne apres avoir entrer la valeur
		console.nextLine();
		System.out.println(i);
		*/
		
		// la declaration des variables TP3 
		
	    byte b=10;
	    short t=-17282;
	    int i =10;
	    long l =100L;
	    double y =1.0D;
	    boolean top =true;
	    char c = 'c';
	    float f=3.5F;
	    
	    // la declaration de la chaine de caractere tout en utilisant le retour a la ligne \n pour afficher le resultat a la line suivante 
	    
	    String randomString = "Voici le r�sultat d�un calcul :\n 1+5=6";
	    String chaine ="top";
	    
	    // afficher les informations de chaque variable 
	    
	    System.out.println(b);
	    System.out.println(t);
	    System.out.println(t);
	    System.out.println(randomString);
	    System.out.println(chaine);
	    

	}

}
