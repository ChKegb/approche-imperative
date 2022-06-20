package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//La declaration des taableau avec des valeurs 
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
		//Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		//System.out.println(" ")
		System.out.println("La copie de tous les éléments de array dans arrayCopy mais dans l’ordre inverse.");
		int [] arrayCopy=new int[array.length];
		// om parcourt le tableau array dans le sens opposes pour copier 
		for (int i=array.length-1;i>=0;i--) {
			arrayCopy[i]=array[i];
			System.out.println(arrayCopy[i]);
			
		}
		System.out.println("Affichage  des 2 tableaux ");
		
		//Autre maniere de faire la copie dans l'ordre croissant
		
		for (int i=0;i<arrayCopy.length;i++) {
			arrayCopy[i]=array[array.length-1-i];
			System.out.println(arrayCopy[i] + "\t"+ array[i]);
		
		//Afficher l’ensemble des éléments des 2 tableaux
		}
		System.out.println("Affichage  des 2 tableaux ");
		
		for (int i = 0; i < arrayCopy.length; i++) {
			
			System.out.println( array[i] + " \t|" + arrayCopy[i]);
	
	}

}
}
