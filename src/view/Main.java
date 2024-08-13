package view;

import controller.Controller;

public class Main 
{

	public static void main (String[] args) 
	{
		Controller c = new Controller();
		
		int numA = 24;
		int numB = 20;
		
		int resultado = c.MDC(numA, numB);
		
		System.out.println(resultado);
		
	}
	
}
