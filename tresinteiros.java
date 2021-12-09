package fami41;

import java.util.Scanner;

public class tresinteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3 ;
		
 Scanner leia = new Scanner (System.in);
 
 
 System.out.println("\nInforme o primeiro número: ");
 
 n1 = leia.nextInt();
 
 
System.out.println("\nInforme o segundo número: ");
 
 n2 = leia.nextInt();
 
System.out.println("\nInforme o terceiro número: ");
 
 n3 = leia.nextInt();
 
 if(n1 > n2 && n1 > n3) 
 {
		System.out.printf("O primeiro número digitado, "+n1+", é o maior!");
		
	}
 else if (n2 > n1 && n2 > n3)
 {
		System.out.printf("O segundo número digitado, "+n2+", é o maior!");
		
	}
 else 
	{
		System.out.printf("O terceiro número digitado, "+n3+", é o maior!");
	}
 
	}

}
