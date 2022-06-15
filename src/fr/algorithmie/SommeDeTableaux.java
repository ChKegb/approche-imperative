package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//les declarations des tabbleaux 
		int [] array1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int [] array2={-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};
		// Nous procedons a la declaration du nouveau tableau afin de faire la somme a l''interieur
		
		int [] array =new int [array1.length];
		if(array1.length==array2.length) {
			for (int i=0;i<array1.length;i++) {
				array[i]=array1[i]+array2[i];
				System.out.println(array[i]);
			}
		}

}
}
