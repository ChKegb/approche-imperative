package fr.boucles;
//TABLEAUX, BOUCLES ET CONDITIONS
//EXERCICE : BOUCLES DE BASE
public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Affichez tous les nombres de 1 à 10
		System.out.println("le nombre de 1 à 10");		
		for(int i=1;i<10;i++) {
			
					System.out.println(i);
		}
		
		//Affichez 20 fois votre nom et votre prénom
		
		// Declaration des variables nom et prenoms
		String nom="KEGBA";
		String prenom="Chancelin";
		
		// Parcours et affichaages des noms et prenoms 20 fois 
		System.out.println("Afficher 20 fois le nom et prenom");
		
		for(int i=1;i<20;i++) {
			
			System.out.println(nom+prenom);
		}
			
		//Affichez les éléments pairs de 2 à 100 en utilisant la methode modulo 
		System.out.println("Les éléments pairs de 2 à 100");
		
		
		for(int i=2;i<=100;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		//Affichez les éléments impairs de 1 à 99
		System.out.println("les éléments impairs de 1 à 99");
		for(int i=2;i<=100;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}		

	}

}
