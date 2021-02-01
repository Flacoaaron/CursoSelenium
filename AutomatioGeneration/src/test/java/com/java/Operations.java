package com.java;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aritmeticos.
		int x = 2;
		int y = 3;
		
		int z = x * y;
		
		System.out.println("la suma es: " + z);
		
		//operadore uniarios
		int A = 2;
		int B = 2;
		
//		System.out.println(-A);
//		System.out.println(--A);
//		System.out.println(-B);
//		System.out.println(--B);
//		System.out.println(+A);
//		System.out.println(++A);
//		System.out.println(+B);
		System.out.println(++B);
		
		//Relacionales
		
		int C = 2;
		int D = 2;
		
		if (C != D) {
			
			System.out.println("C y D son Diferentyes");
		}
		
		if (C == D) {
			
			System.out.println("C y D son iguales");
		}
		
		if (C < D) {
			
			System.out.println("C es menor aDB ");
		}
		
	
		if (C >= D) {
			
			System.out.println("C mayor o igual a D ");
		}
		
		
		
		//condicionales 
		//&& and
		//|| or
		
		int var1 = 5;
		int var2 = 6;
		int var3 = 3;
		int var4 = 3;
		
		if (var1 == var2 && var3 == var4) {
			System.out.println("var 1 y 3 iguales and var 3 y 4 iguales");
		}

		if (var1 == var2 || var3 == var4) {
			System.out.println( "var 1 y 2 iguales o var 3 y 4 iguales");
		}
		
		
		
	}

}
