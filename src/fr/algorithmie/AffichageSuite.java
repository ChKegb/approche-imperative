package fr.algorithmie;

import java.util.Scanner;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        
		int nombre ;
		Scanner console=new Scanner(System.in);
		
		//Affichage de mot
		System.out.println("Veuillez entrer le nombre");
		
		// saisie de nombre
		
		nombre=console.nextInt();
		console.nextLine();
		//console.close();
		int i=0;	
		/*
		while(i<nombre){
			
			System.out.println(i);
			i++;
			
		}
		*/
		//Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		
		//System.out.println("Veuillez entrer le second nombre");
		
		// saisie des nombre
		//int nombre2;
		//nombre2=console.nextInt();
		//console.nextLine();
		
		// Methode affficher le nombre pair avec la boucle while
		
		while(i<=nombre){
			i++;
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			
		}
		
		// Methode affficher le nombre impair avec la boucle while
		
		while(i<nombre){
			i++;
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
			
		}
		console.close();
	}

}
