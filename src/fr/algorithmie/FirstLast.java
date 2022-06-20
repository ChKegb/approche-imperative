package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array1= {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6} ;
		boolean test=false;
		//si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
		if((array1.length >= 1) && (array1[0]==array1[array1.length-1])) {
			
			System.out.println(!test);
		}
		System.out.println(test);
	}

	}


