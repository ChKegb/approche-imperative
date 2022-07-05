package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		Scanner console= new Scanner(System.in);
		int n1 = 0, n2 = 1, nb, result = 0;
		
		
		do {
			System.out.println("Saisir un entier supérieur à 1 :");
			nb = console.nextInt();
			console.nextLine();
		} 
		while (nb <= 1);
		
		for(int i=2; i<=nb; i++) {
			result = n2 + n1;
			n1 = n2;
			n2 = result;
		}
		
		System.out.println("\nRésultat : " + result);
		console.close();
	}

}
