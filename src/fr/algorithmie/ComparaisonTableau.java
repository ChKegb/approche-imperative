package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 ={1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int [] array2 ={3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		
		//compter le nombre d’éléments en commun dans ces 2 tableaux(nombre d'occurence )
		
		int nbocc=0;
		// on parcours les deux longueurs en verifiant si i est inferieur au deux
		
		for (int i=0;i<array1.length && i<array2.length;i++) {
			
				if(array1[i]==array2[i]) {
					nbocc++;
				}
			
			
		}
		System.out.println(nbocc); 
	}

}
