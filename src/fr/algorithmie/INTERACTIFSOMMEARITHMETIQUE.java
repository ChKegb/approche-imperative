package fr.algorithmie;
//EXERCICE INTERACTIFSOMMEARITHMETIQUE
import java.util.Scanner;

public class INTERACTIFSOMMEARITHMETIQUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les entiers compris entre 1 et ce nombre
		Scanner console=new Scanner(System.in);
		int nb;
		
		do {
			System.out.println("Veuillez saisir un nombre :\n");
			nb=console.nextInt();
		}
		while(nb<1);
		console.close();
		int resultat=0;
		for(int i=1 ;i<=nb;i++) {
			resultat=resultat+i;
		}
		System.out.println(resultat);
	}

}
