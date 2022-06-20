package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

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
			//affiche les 10 nombres suivants
			System.out.println( nb++);
		}
	}

}
