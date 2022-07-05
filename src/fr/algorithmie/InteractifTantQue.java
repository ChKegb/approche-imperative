package fr.algorithmie;
//EXERCICE INTERACTIFTANTQUE
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		//Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 :
		    
		Scanner console=new Scanner(System.in);
		int nb;
		
		do {
		System.out.println("Veuillez saisir un nombre compris de 1 à 10 :\n");
		// la saisie des nombres 
		nb=console.nextInt();
		}
		while(nb<1 || nb>10);
			System.out.println("Le nombre saisi est :"+nb);
			console.nextLine();
			console.close();
		
		
		
		
	
	}
}
