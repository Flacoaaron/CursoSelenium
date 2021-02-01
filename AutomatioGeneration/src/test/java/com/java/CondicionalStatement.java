package com.java;

public class CondicionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 120; //KM/h
		int limiteVelocidad = 80;
		
//		
//		if (velocidad >= limiteVelocidad) {
//			
//			System.out.println("El coche va a exceso de velocidad");
//		}	else {
//			System.out.println("El coche va en velocidad adecuada");
//			
//		} 
		
		//if anidado
		
		boolean carretera = false;
		
		if (!carretera) { //tambien puede ser carretera == true //!carretera para indicar es falso
			System.out.println("Estas en una carretera");
			
			limiteVelocidad = 110; //km/H
			
			if (velocidad >= limiteVelocidad) {
				
				System.out.println("El coche va a exceso de velocidad");
			}	else {
				System.out.println("El coche va en velocidad adecuada");
				
			} 
		}else if (velocidad > limiteVelocidad) {
			System.out.println("el coche esta en una calle y va a ecceso de velocidad");
		}else {
			
			System.out.println("el coche esta en una calle y va a velocidad adecuada");
			
		}
		
		
		

	}

}
