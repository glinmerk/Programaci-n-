package conmastiposdatos;
import java.util.Scanner;
public class PruebaSumtorioSinFunciones {
	
	public static void main(String[] args) {
		/**
		 * De la siguiente forma que se muestra nos podemos ahorrar el control de excepciones
		 * y el escribir tantas lineas de codigo
		 */

		
		//variables
		String numero;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdzca un numero: ");
		numero=sc.nextLine();
		
		
		/*Verificaciones tipo de dato
		 * 
		 * 
		 * Al ser una cadena debemos hacer lo siguiente para poder recoger el contenido
		 * determinando asi el tipo de dato que es para ello hacemos lo siguiente:
		 * 
		 * 
		 *Necesiatamos saber si hay un punto o no en la cadena hay dos formas:
		 * 
		 * 
		 * 1ª Forma:  Variable.contains(".") --> Itera cada caracter con el patron a coincidir de forma automatica devolviendo un boolean
		 */
		
		if(numero.contains(".")==true) {
			
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
			
			
		}else if(numero.contains(".")==false){
		
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
