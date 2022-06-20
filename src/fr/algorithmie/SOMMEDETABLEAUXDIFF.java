package fr.algorithmie;

public class SOMMEDETABLEAUXDIFF {
//EXERCICE SOMMEDETABLEAUXDIFF
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//les declarations des tableaux 
		
		int [] array1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int [] array2={-1,12,17,14,5,-9,0,18};
		int [] array= new int[Math.max(array1.length, array2.length)]	;			
		
		// definisant le taille de nouveau tableau en faisant la comparaison entre les deux tableaux
		/*
	    for(int i=0;i<=array.length;i++) {
	    	if(i >array1.length) {
	    		array1[i]=0;
	    	}else {
	    		array2[i]=0;
	    	}
	    	array[i]=array1[i]+array2[i];
	    	System.out.println(array[i]);
	    }
		*/		 
		for(int i=0;i<=array.length;i++) {
			var tab1 = array1.length > i ? array1[i]:0;
			var tab2 = array2.length > i ? array2[i]:0;
			array[i]=tab1+tab2;
			System.out.println(array[i]);
		}
		
		
		
	
		
			     

	}
	
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 	System.out.println("a somme des 2 précédents tableaux avec des tailles differentes");
		if(array1.length==array2.length) {
			System.out.println("array1 est egal array2");
			array=new int[array1.length];
			for(int i=0;i<array1.length;i++) {
				array[i]=array1[i]+array2[i];
			    System.out.println(array[i]);
		     }
						
		}else if(array1.length >array2.length){
			System.out.println("array1 est superieur array2");
			 array=new int[array1.length];
			 for(int i=0;i<=array1.length;i++) {
				for(int j=0 ;j<= array2.length; j++) {
				    array[i]= array2[j]+array1[i];
				    System.out.println(array[i]);
		
				}
				
				
				
			 }	
		
		  }
 * 
 * else {
			  array=new int[array2.length];
			  for(int i=0;i<array2.length;i++) {
				  for(int j=0;j<=array1.length;j++){
					array[i]=array2[i]+array1[j];
					
				  }
				 }
				  
			  }
 * 
 * 
 * 
 * for(int i=0;i<=array1.length;i++) {
			if(i <array2.length) {
				array=new int[array2.length];
				array[i]=array1[i]+array2[i];
			}else {
				array=new int[array1.length];
				array[i]=array1[i]+array2[i];
			}
			System.out.println(array[i]=array1[i]+array2[2]);
		}
	}*/
 