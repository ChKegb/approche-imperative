package fr.algorithmie;
//INTERACTIFTABLEMULTiplication
import java.util.Scanner;
//INTERACTIFTABLEMULT
public class InteractifTableMult {

	public static void main(String[] args) {
		// Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre.
	    
			Scanner console=new Scanner(System.in);
			int nb;
			
			do {
				System.out.println("Veuillez saisir un nombre compris de 1 à 10 :\n");
				nb=console.nextInt();
			}
			while(nb<1 || nb>10);
			System.out.println("Ce nombre est :"+nb);
			console.nextLine();
			console.close();
			System.out.println("\n Voici la table de multiplication de ce nombre que vous venez de saisir :");
			for(int i=1;i<=10;i++) {
				//affiche la table de multiplication de ce nombre
				System.out.println( "\n" + nb + "*" + i + "=" +(nb * i));
			}
	}

}
