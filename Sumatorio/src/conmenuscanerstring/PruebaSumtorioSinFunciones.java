package conmenuscanerstring;
import java.util.Scanner;
public class PruebaSumtorioSinFunciones {

	public static void main(String[] args) {
		/**
		 * De la siguiente forma que se muestra nos podemos ahorrar el control de excepciones
		 * y el escribir tantas lineas de codigo
		 **/
		
		//variables
		String numero;
		int contador=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdzca un numero: ");
		numero=sc.nextLine();
		
		
		
		/*PASAR INT A CADENA
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
		
		while(contador<=terminar){
			contador=contador+terminar;
			contador=contador+1;
		}
		System.out.println(contador);
		sc.close();
	}

}
