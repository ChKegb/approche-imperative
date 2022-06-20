package fr.algorithmie;
//INTERACTIFTABLEMULTiplication
import java.util.Scanner;
//INTERACTIFTABLEMULT
public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
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
			for(int i=1;i<=10;i++) {
				//affiche la table de multiplication de ce nombre
				System.out.println( "\n" + nb + "*" + i + "=" +(nb * i));
			}
	}

}
