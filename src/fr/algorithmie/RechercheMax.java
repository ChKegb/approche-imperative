package fr.algorithmie;
//EXERCICE RECHERCHEMAX
public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration du tableau 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		//declaration max en pointant sur la premiere valeur du tabbleau afin de faire la comparaison 
		int max = array[0];
		for (int i=0;i<array.length;i++) {
			// on veriffie a chaque parcours si la valeur du tableau  est superieur a max
			
			if (array[i]>max) {
				max = array[i];
			}
			
		}
		System.out.println("le plus grand nombre est :"+ max);
		
	}

}
