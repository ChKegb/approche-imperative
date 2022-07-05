package fr.boucles;

import java.util.Arrays;

//BOUCLES COMBINEES AVEC DES TESTS
public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Declaration d'un tableau de type entier 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle");
		
		for( int i=0;i< array.length;i++) {
			System.out.println(array[i]);
		}
		
		// autre maniere Afficher l'ensemble des Elements du tableau grace avec la boucle foreach
		 
		for( int i : array ){
			
			System.out.println(i);
			
		}	
		
		//Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("L’ensemble des éléments dans l’ordre inverse du tableau");
		
		for(int i=array.length - 1;i>=0;i--) {
			System.out.println(array[i]);
		}
		
		//Autre maniere de faire en divisant le tableau en 2 pour proceder au parcours puis faire l'affichae en tableau
		
		
		System.out.println("Autre maniere de  l'inverse de tableau: ");
		for(int i=0;i< array.length/2; i++) {
			int tmp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = tmp;
			System.out.println(Arrays.toString(array));
		   }
		   
		// Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		System.out.println("les entiers superieur à 3");
		for(int i=0;i<array.length;i++) {
			if(array[i]> 3) {
				System.out.println(array[i]);
			}
			
		}
		//Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println(" les entiers pairs: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]% 2 == 0) {
				System.out.println(array[i]);
			}
			
		}
		//Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs

		System.out.println(" les index  pairs: ");
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 == 0) {
				System.out.println(i);
			}
			
		}
		
		//Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		
		System.out.println(" les entiers impairs: ");
		for(int i=0;i<array.length;i++) {
			if(array[i]% 2 != 0) {
				System.out.println(array[i]);
			}
			
		}
	}
	
}



