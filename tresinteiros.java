package fami41;

import java.util.Scanner;

public class tresinteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3 ;
		
 Scanner leia = new Scanner (System.in);
 
 
 System.out.println("\nInforme o primeiro n�mero: ");
 
 n1 = leia.nextInt();
 
 
System.out.println("\nInforme o segundo n�mero: ");
 
 n2 = leia.nextInt();
 
System.out.println("\nInforme o terceiro n�mero: ");
 
 n3 = leia.nextInt();
 
 if(n1 > n2 && n1 > n3) 
 {
		System.out.printf("O primeiro n�mero digitado, "+n1+", � o maior!");
		
	}
 else if (n2 > n1 && n2 > n3)
 {
		System.out.printf("O segundo n�mero digitado, "+n2+", � o maior!");
		
	}
 else 
	{
		System.out.printf("O terceiro n�mero digitado, "+n3+", � o maior!");
	}
 
	}

}
