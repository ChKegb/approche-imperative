package fr.algorithmie;

import java.lang.reflect.Array;
//EXERCICE FIRSTLAST6
public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		
		int [] array1= {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6} ;
		boolean test=false;
		//si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		if((array1.length > 0 && array1[0]==6|| array1[array1.length-1]==6)) {
			
			System.out.println(!test);
		}else {
		System.out.println(test);
		}
		
	}

}
