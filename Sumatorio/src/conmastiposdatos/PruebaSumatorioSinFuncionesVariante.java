package conmastiposdatos;

import java.util.Scanner;

public class PruebaSumatorioSinFuncionesVariante {

	public static void main(String[] args) {
		/**
		 * De la siguiente forma que se muestra nos podemos ahorrar el control de excepciones
		 * y el escribir tantas lineas de codigo
		 */
		
		
		//variables
		String numero;
		boolean es_double=false;
		boolean es_int=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdzca un numero: ");
		numero=sc.nextLine();
		int longitud= numero.length();
		
		/* 2ª Forma:
		* - Saber la longitud de la cadena --> variable.length()
		*
		* - Bucle for --> con un inicio, comparando el inicio <= variable.length() y aumentando inicio --> Indice a indice ocupado por un carcter cada uno
		*   
		*   1º Coger el caracter en el indice incio --> variable.charAt(inicio);
		*   2º Pasar de char a String para poder utilizar posteriormente equals--> Character.toString(variable char)
		*   2º Comaparar el caracter con el que tiene que coincidir--> caracter.equals(patron_coincidencia)
		*   3º Devolver true o false dependiendo del caso
		* 	
		* NOTA: el paso dos se realiza ya que el metodo .charAt(inicio) devuelve una variable tipo de char o Character
		* Codigo Final:
		* 
		* 
			 int longitud= terminar.length();
			 
				for(int inicio=0;inicio<=longitud;inicio++) {
				
					String caracter=Character.toString(variable.charAt(inicio));
					
					if(caracter.equals(".")) {
						es_float=true;
					}
				}
		*/
		for(int inicio=0;inicio<=longitud;inicio++) {
		
			String caracter=Character.toString(numero.charAt(inicio));
			
			if(caracter.equals(".")) {
				es_double=true;
			}else {
				es_int=true;
			}
		}
		
		if(es_double=true) {
			/*PASAR CADENA A DOUBLE
			 * 
			 * Declaramos una variable tipo int para almacenar dicha cadena --> En mi caso terminar
			 * 
			 * 1º Pasar la cadena a int --> Integer.parseInt(cadena a convertir)
			 * ERROR: Dicho metodo solo acepta datos tipo char o Character
			 * 
			 * SOLUCION: Utilizar el metodo String.alueOf(cadena a convertir) dentro de Integer.parseInt(cadena a convertir)_
			 * 
			 * Codigo final: int terminar=Integer.parseInt(String.valueOf(numero));
			 * 
			 */
			
			double terminar=Double.parseDouble(numero);
			
			/*metodo sumar para cada de los tipos de datos
			 * 
			 * 1º Declramos e inicializamos una variable del tipo dato tratar --> tipo_dato_tratar contador=0
			 * 2º Realizamos el bucle while para el sumatorio
			 */
			double contador=0;
			
			while(contador<=terminar){
				contador=contador+terminar;
				contador=contador+1;
			}
			
			//mostrar resultado
			System.out.println(contador);
		}else {
			/*PASAR CADENA A INT
			 * 
			 * Declaramos una variable tipo int para almacenar dicha cadena --> En mi caso terminar
			 * 
			 * 1º Pasar la cadena a int --> Integer.parseInt(cadena a convertir)
			 * ERROR: Dicho metodo solo acepta datos tipo char o Character
			 * 
			 * SOLUCION: Utilizar el metodo String.alueOf(cadena a convertir) dentro de Integer.parseInt(cadena a convertir)_
			 * 
			 * Codigo final: int terminar=Integer.parseInt(String.valueOf(numero));
			 * 
			 */
			
			int terminar=Integer.parseInt(String.valueOf(numero));
			
			/*metodo sumar para cada de los tipos de datos
			 * 
			 * 1º Declramos e inicializamos una variable del tipo dato tratar --> tipo_dato_tratar contador=0
			 * 2º Realizamos el bucle while para el sumatorio
			 */
			
			int contador=0;
			
			//suma tipo int
			while(contador<=terminar){
				contador=contador+terminar;
				contador=contador+1;
			}
			
			//mostrar resultado
			System.out.println(contador);
		}
		
		sc.close();
	}

}
