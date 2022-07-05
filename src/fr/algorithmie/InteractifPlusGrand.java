package fr.algorithmie;
//EXERCICE INTERACTIFPLUSGRAND
import java.util.Scanner;

//EXERCICE INTERACTIFPLUSGRAND
public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand deces nombres.
	
		Scanner console=new Scanner(System.in);
		int nb;
		int max=0;
		
		for(int i=0;i< 10;i++) {
			System.out.println("Veuillez saisir au moins 10 nombres  :\n");
			nb=console.nextInt();
			console.nextLine();
			if(max<nb) {
				max=nb;
			}
			
			
		}
		System.out.println("\n la valeur maximale est :" + max);
		console.close();
		
		
		
	
	}

}
