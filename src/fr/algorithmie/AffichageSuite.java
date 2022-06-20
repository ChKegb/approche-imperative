package fr.algorithmie;

import java.util.Scanner;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
		
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
		
		System.out.println("les nombres pairs entre 0 et 10 inclus : ");
		for (int i=0;i<=10;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		//Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
		System.out.println("les nombres impairs entre 0 et 10 inclus : ");
		
		for (int i=0;i<=10;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
		// Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
		System.out.println("les nombres  entre 0 et 10 inclus avec la boucle while : ");
		int i=1;
		while(i<=10) {
		
			System.out.println(i);
			i++;
			
		}
		//Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		
		System.out.println("les nombres pairs entre 0 et 10 inclus avec la boucle while : ");
		int j=1;
		while(j<=10) {
		    if(j%2==0) {
		    	System.out.println(j);
		    }
		    j++;
			
		}
		
		//Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
		
		System.out.println("les nombres impairs entre 0 et 10 inclus avec la boucle while : ");
		int k=1;
		while(k<=10) {
		    if(k%2!=0) {
		    	System.out.println(k);
		    }
		    k++;
			
		}
		
		
		

	}

}
