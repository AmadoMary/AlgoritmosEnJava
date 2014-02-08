/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {
   		int numeroActual = 0;
   		System.out.println(args[0]);
		numeroActual=Integer.parseInt(args[0].toString());
		
		while (numeroActual>0)
		{
			// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
			if (numeroActual%3==0 && numeroActual%5==0)
			{
				System.out.println("FlipFlop");
			}
	 	
   			// si el numero es divisible dentro de 3 imprima "Flip"
			else if (numeroActual%3==0 && numeroActual%5!=0)
			{
				System.out.println("Flip");
			}
   		
			// si el numero es divisible dentro de 5 imprima "Flop"
			else if (numeroActual%5==0 && numeroActual%3!=0)
			{		
				System.out.println("Flop");
			}
		   			
			// de lo contrario, imprima el numero
			else
			{      		
			System.out.println(numeroActual);
			}	
		numeroActual--;
		}
   }

}
