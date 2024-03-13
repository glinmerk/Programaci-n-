package sumatorio;
import java.util.Scanner;
public class PruebaSumatorio {
	public static boolean esDistintoInt(String numero_final) {
		boolean es_distinto_int=false;
		
		if(numero_final.contains(".")) {
			es_distinto_int=true;
		}
		
		return es_distinto_int;
	}
	
	public static void main(String[] args) {
		/*
		 *Programa para realizar suamtorios --> suma consecutiva de numeros hasta un numero finito introducida por el usuario
		 *
		 * Declaramos una variable tipo entera inicalizada a cero -->llamada suma (para utilizarla posteriormente)
		 * Introducir un valor entero, es decir, sin decimales de tipo Scanner -->[sc] --> variable declarada como "fin"
		 * Declaramos un bucle para tener una variable con inicio que se revalorice hasta fin de forma automatica --> i
		 * 
		 * Declaramos la suma del numero consecutivo siguiente --> variable declarada como siguiente y compuesta por:
		 * -i+1
		 *  
		 * Declaramos una variable para guardar la suma del valor anterior de i --> variable declarada suma_anterior compuesta por:
		 * - Anterior de i -->(i-1)
		 * - Siguiente de anterior de i -->((i-1)+1)
		 * 
		 * Llamamos a suma en el bucle for para calcular el sumatorio y est compuesto por:
		 * - siguiente
		 * - suma_anterior
		 * 
		 * Imprimir suma
		*/
		
		//variables
		int resultado=1;
		int terminar=0;
		int contador=1;
		Scanner sc=new Scanner(System.in);
		//Pedir limite al que contar
		try {
			System.out.println("¿Hasta que numero quiere sumar?");
			terminar=sc.nextInt();			
			while(resultado<=terminar) {
				resultado=resultado+contador;
				contador=contador+1;
			}
			//mostrar contador --> resultado final del sumatorio
			System.out.println("Suamtorio= "+contador);
		}catch(java.util.InputMismatchException e) {
			System.out.println("ERROR: No ha introduciso un valor numerico NO ENTERO");			
		}finally{
			String numero_final=String.valueOf(terminar);
			
			boolean es_distinto=esDistintoInt(numero_final);
			
			if(es_distinto==true) {
				sc.close();//--> cerrar escaner
				//creamos un nuevo escaner
				Scanner nuevoescaner=new Scanner(System.in);
				System.out.println("¿Hasta que numero quiere sumar?");
				int fin_contar=nuevoescaner.nextInt();
				
				//sumar hasta fin --> determinado por el usuario
				while(resultado<=fin_contar) {
					resultado=resultado+contador;
					contador=contador+1;
				}
				//mostrar contador --> resultado final del sumatorio
				System.out.println("Suamtorio= "+contador);
				//cerrar escaner nuevo
				nuevoescaner.close();
			}
		}
		
		
		
		
		
		
		
		}
		
	}