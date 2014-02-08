/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   
   public static void main(String[] args) {
	int a;
	int b;
      	a=Integer.parseInt(args[0].toString());
	b=Integer.parseInt(args[1].toString());
	
	if(a>b)
	{
		while(a-1>b)
		{
		a=a-1;
	   	  System.out.print(a+" ");			
		}
	}

	else if(a<b)
	{
		while(a+1<b)
		{
		b=b-1;
		  System.out.print(b+" ");
		}	
	}	
	}
}