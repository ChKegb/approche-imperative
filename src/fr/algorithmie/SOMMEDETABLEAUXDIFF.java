package fr.algorithmie;

public class SOMMEDETABLEAUXDIFF {
//EXERCICE SOMMEDETABLEAUXDIFF
	public static void main(String[] args) {
		
		
		//les declarations des tableaux 
		
		int [] array1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int [] array2={-1,12,17,14,5,-9,0,18};
		int [] array= new int[Math.max(array1.length, array2.length)]	;	
		int tab1,tab2;
		
		System.out.println("\n la difference entre les deux tableaux");	 
		for(int i=0;i<=array.length;i++) {
			 tab1 = array1.length > i ? array1[i]:0;
			 tab2 = array2.length > i ? array2[i]:0;
			 array[i]=tab1+tab2;
			
			System.out.println(array[i]);
		}
		
		
		
	
		
			     

	}
	
}
