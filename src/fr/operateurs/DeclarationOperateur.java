package fr.operateurs;

//TP 04 les Operateurs 

public class DeclarationOperateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//les declarations 
		
		int a=10;
		int b=20;
		boolean testEt = a>0 && b<10;
		boolean testOu = a>0 || b<10;
		
		// testons l' operation ternaire
		/*
		 * cette operation teste si a > 0 alorsn il renvoie le message"a est plus grand que 0"
		 * sinon il renvoie "a est inf�rieur � 0" 
		 * */
		
		String c = a >0 ? "a est plus grand que 0": "a est inf�rieur � 0";
		
		//les types d'incrementation en langage de programation  
		
		a=a+1;
		System.out.println(a);
		a++;
		System.out.println(a);
		a+=1;
		
		// afficher les valeurs des variables 
		
		System.out.println(a);
		System.out.println(testEt);
		System.out.println(testOu);
		System.out.println(c);

	
	
	}

}
