package fr.algorithmie;
import java.util.Random;
//EXERCICE INTERACTIFPLUSMOINS
import java.util.Scanner;

public class INTERACTIFPLUSMOINS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner console=new Scanner(System.in);
		int nb,nbG;
		System.out.println("Veuillez saisir un nombre  :\n");
		nb=console.nextInt();
		// on genere un nombre aléatoire entre 1 et 100
		nbG= new Random().nextInt(100);
		System.out.println("\n le nombre genere est : " + nbG);
		// comparons notre saisie avec le nombre genere  
		if(nb==nbG) {
			System.out.println("Bravo vous avez gagné");
		}else if(nb>nbG) {
			System.out.println("le nombre saisie : " + nb +"  est superieur "+nbG +"  au nombre genere ");
		}else {
			
				System.out.println("le nombre saisie : " + nb +"est inferieur "+nbG +"au nombre genere ");
		}
	
	}

}
