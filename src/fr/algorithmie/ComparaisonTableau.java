package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 ={1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int [] array2 ={3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		
		//compter le nombre d’éléments en commun dans ces 2 tableaux(nombre d'occurence )
		
		int nbocc=0;
		// on parcours les deux longueurs en verifiant si les valeurs dans les deux tableaux sont identique
		// parcours le tableau 1
		for (int i=0;i<array1.length;i++){
			// parcours le tableau 2
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					nbocc++;
				}
			
			
			}
		
		}
		System.out.println("\n le nombre d’éléments en commun : " + nbocc); 

	}
}
