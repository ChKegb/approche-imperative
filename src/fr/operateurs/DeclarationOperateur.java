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
		
		// operation ternaire 
		
		String c = a >0 ? "a est plus grand que 0": "a est inférieur à 0";
		
		//incrementation en java 
		
		a=a+1;
		a++;
		a+=1;
		
		// afficher les variables 
		
		System.out.println(testEt);
		System.out.println(testOu);
		System.out.println(a);
		System.out.println(c);

	
	
	}

}
