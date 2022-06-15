package fr.algorithmie;

public class SOMMEDETABLEAUXDIFF {
//EXERCICE SOMMEDETABLEAUXDIFF
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//les declarations des tabbleaux 
		
		int [] array1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int [] array2={-1,12,17,14,5,-9,0,18};
		int [] array	;			
		// Nous procedons a la declaration du nouveau tableau afin de faire la somme a l'interieur tout en ffaisant la oomparaison sur la longuey
		//Creation du 3 eme tableau
		// faisant la comparaison entre les taille des 2 tableaux 
		
		if(array1.length >= array2.length) {
			 array =new int[array1.length];
		}else {
			array =new int[array2.length];
		}
		
		if(array1.length >= array2.length) {
			// si array1 estt plus grd que l'autre   
			
			for (int i = 0; i< array1.length;i++){

				// On ne fait la somme que jusqu'à l'index max du tableau 2
				
				if (i < array2.length){
					array[i]= array1[i]+ array2[i];
				} else {
					array[i] = array1[i];
				}
				System.out.print(array[i] + " ");
			}
		} else {
			// si le tableau 2 est le plus grand
			
			for (int i = 0; i < array2.length; i++) {

				// On ne fait la somme que jusqu'à l'index max du tableau 1
				if (i < array1.length) {
					array[i] = array1[i] + array2[i];
				} else {
					array[i] = array2[i];
				}
				System.out.print(array[i]);
			}
		}
			
		}
		
			     

	}

