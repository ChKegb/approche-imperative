package fr.algorithmie;
//TP 7
public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//calculons la somme des tableaux avant de calculer la moyenne
		//Declaration des variables pour faire le calcul 
		int somme=0;
		double moyenne;
		for (int i=0;i<array.length;i++) {
			somme= somme + array[i];
		}
		//avant de proceder au calcul de la moyenne nous devons convertir la valeur de somme en double
		
		moyenne = (double)somme / (double)array.length;
		System.out.println("la moyenne des elements du tableau est :"+moyenne);
		
		
		
	}

}
