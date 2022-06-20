package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		System.out.println("Affichage des entiers superieurs à 3");
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
