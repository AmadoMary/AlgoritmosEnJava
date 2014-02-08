/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
		int a;

   		System.out.println(args[0]);

		a=Integer.parseInt(args[0].toString());
		
		if (a>valorActual)
		{
			while(a-1>valorActual){
			a=a-1;
	   	  	System.out.println(a+" ");
			}
	}	
	}				
}