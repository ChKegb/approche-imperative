package fr.boucles;
//PARCOURS D�UN TABLEAU D�ENTIERS
public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration des tableaux 
				int tab[]= {1,2,3,4,5,6,7,8,9,10};
				
				//afficher les tableaux
				System.out.println(tab[0]);
				//Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8.
				tab[4]=8;
				
				// afficher le premier �l�ment du tableau
				System.out.println(tab[4]);
				//Affichez la longueur du tableau en utilisant la propri�t� length
				System.out.println(tab.length);
				//Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
				System.out.println(tab[tab.length-1]);

	}

}
