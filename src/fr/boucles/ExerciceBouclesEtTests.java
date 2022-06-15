package fr.boucles;

import java.util.Arrays;

//BOUCLES COMBINEES AVEC DES TESTS
public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Declaration d'un tableau de type entier 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs

				System.out.println(" les index  pairs: ");
				
				for(int i=0;i<array.length;i++) {
					if(array[i]%2 == 0) {
						System.out.println(i);
					}
					
				}
		
		
		
		//Afficher l’ensemble des éléments du tableau grâce à une boucle
		
		for( int i=0;i< array.length;i++) {
			System.out.println(array[i]);
		}
		
		// autre maniere Afficher l'ensemble des Elements du tableau grace avec la boucle foreach
		 
		for( int i : array ){
			
			System.out.println(i);
			
		}	
		
		//Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		
		for(int i=array.length - 1;i>=0;i--) {
			System.out.println(array[i]);
		}
		
		//Autre maniere de faire en divisant le tableau en 2 pour proceder au parcours puis faire l'affichae en tableau
		
		
		System.out.println(" l'inverse de tableau: ");
		for(int i=0;i< array.length/2; i++) {
			int tmp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = tmp;
			System.out.println(Arrays.toString(array));
		   }
		   
		// Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		
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

/*
 * 
 * 
 * // d�claration d'un tableau d'entiers directement initialis� de 1 � 10 : 
		int[] tab = {1,2,3,4,5,6,7,8,9,10}; 
	    // afficher le premier element de notre tableau
		System.out.println(tab[1]);
		//afficher la longueur de notre tableau 
		System.out.println(tab.length);
		//Affichez le dernier �l�ment de notre tableau en utilisant la propri�t� length
		System.out.println(tab[tab.length-1]);
		//Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8.
		tab[4]=8;
		System.out.println(tab[4]);
		*/


/*
// d�claration d'un tableau de dix entiers : 
int[] te = new int[10]; 
 
// d�claration d'un tableau de 3 nombres r�els : 
double[] tr = new double[3]; 
 
// d�claration d'un tableau de 30 caract�res : 
char[] tc = new char[30]; 
 
// d�claration d'un tableau de 6 cha�nes de caract�res : 
String[] tt = new String[6]; 
/*
 * for( int i=0; i<=10;i++) {
 */

