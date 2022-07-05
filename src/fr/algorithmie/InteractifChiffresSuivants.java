package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants. Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.


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
			//affiche les 10 nombres suivants de nombre saisi
			System.out.println( nb++);
		}
	}

}
