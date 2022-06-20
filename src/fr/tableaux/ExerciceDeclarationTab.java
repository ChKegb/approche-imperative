package fr.tableaux;
// Tp 05 Les tableaux 
public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14,17, 9
		
		//la declaration d'un tableau tout en affectant les valeurs dans chaque case 
		
		int [] tab= {8, -7, 12, 1, -2, 14,17, 9};
		
		//Affichez l’élément du tableau d’index 0 du tableau
		
		System.out.println(tab[0]); 
		
		//Affichez la longueur du tableau
		
		System.out.println(tab.length); 
		
		//Affichez l’entier positionné au dernier index du tableau
		
		System.out.println(tab[tab.length-1]); 
		
		//Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans votre code pour l’expliquer.
		
		System.out.println(tab[10]); 
		
		/*
		 * cela n'est pas possible car la longueur de notre tableau est de 8 et non 10 du coup ca affiche error 
		 * */
		
	}

}
