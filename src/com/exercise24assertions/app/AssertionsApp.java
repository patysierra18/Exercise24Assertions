package com.exercise24assertions.app;

import java.util.Scanner;

public class AssertionsApp {

	public static void main(String[] args) 
	{
		//Variables declaration
		int edad=0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Eres mayor de edad? Introduce tu edad:");
		edad = input.nextInt();
		System.out.println(isMayorEdad(edad));
		assert edad>0: "Edad NO v�lida";
		
	}


	public static String isMayorEdad(int edad)
	{
		String cad ="";
		assert edad>0: "Edad NO v�lida, el m�todo solo acepta valores positivos";
		
		if(edad<18)
		{
			cad =("Menor de edad");
		}
		if(edad>=18)
		{
			cad = ("Chavorruco");
				}
		return  cad;
	}
}



