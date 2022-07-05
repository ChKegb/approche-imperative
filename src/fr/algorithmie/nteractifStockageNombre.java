package fr.algorithmie;

import java.util.Scanner;

public class nteractifStockageNombre {

	public static void main(String[] args) {
		/*
		 
		Demander à l’utilisateur de choisir une option dans le menu.
		Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau.
		Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau. Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
		
		*/
		
		Scanner console=new Scanner(System.in);
		int nb;
		int [] tab1;
		do {
			System.out.println("\n veuillez choisir entre les options en saisie  :");
			System.out.println("option1 : Veuillez saisir 1 pour Ajouter un nombre au programme");
			System.out.println("option2 : Veuillez saisir 2 pour Afficher les nombre existants dans le programme");
			nb=console.nextInt();
			console.nextLine();

			switch (nb) {
			case 1 :
				System.out.println("Veuillez ajouter un nombre au programme");
				int nbAdd=console.nextInt();
				break;
			case 2 :
				break;
			
			

		
			}
		while() {
			}
		}
	}}

	}
}
