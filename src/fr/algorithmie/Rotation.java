package fr.algorithmie;
//EXERCICE ROTATION (DIFFICILE)
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array={0,1,2,3};
		int [] array1=new int [array.length];
		
		// effectuer une rotation à droite des elements 
		for(int i=0;i<array.length;i++) {
			if(i<array.length-1) {
				array1[i+1]=array[i];
			}else {
				array1[0]=array[i];
			}
		}
		for(int i=0;i<array.length;i++) {
			array[i]=array1[i];
			System.out.println(array1[i]);
		}
			
		}
		
	}


