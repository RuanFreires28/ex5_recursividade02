package controller;

public class Controller 
{
	
	public Controller()
	{
		super();
	}
	
	
	public int MDC(int numA, int numB)
	{
		if (numA == numB)
		{
			return numA;
		}
		else if (numA > numB)
		{
			return MDC((numA-numB), numB);
		}
		else 
		{
			return MDC(numB,numA);
		}
	}
	
}
