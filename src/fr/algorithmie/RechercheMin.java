package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		//declaration max en pointant sur la premiere valeur du tableau 
		int min = array[0];
		for (int i=0;i<array.length;i++) {
			// on veriffie a chaque parcours si la valeur est superieur a max
			
			if (array[i]<min) {
				min = array[i];
			}
			
		}
		System.out.println("le plus petit element est :"+min);
		
	}

}
