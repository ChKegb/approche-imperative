package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix
		
		String [] ville= {"Montpellier","Latttes","Mauguio","Lecres","Perols"};
		
		// Affichez les 5 éléments du tableau en utilisant le boucle for 
		
		for(int i=0;i<ville.length;i++) {
			System.out.println(ville[i]); 
		}
		
		//Affichez la longueur du tableau
		
		System.out.println(ville.length); 
		
		//Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
		
		ville[3]="Reims";
		
		//Affichez les 5 éléments du tableau après modification
		
		for(int i=0;i<ville.length;i++) {
			System.out.println(ville[i]); 
		}

	}

}
