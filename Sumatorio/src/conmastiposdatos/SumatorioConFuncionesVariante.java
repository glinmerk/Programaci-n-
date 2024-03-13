package conmastiposdatos;

import java.util.Scanner;

public class SumatorioConFuncionesVariante {

	
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
		 * 
		 */
	
	private static boolean esDouble(String numero) {
		boolean es_double=false;
		
		int longitud= numero.length();
		 
		for(int inicio=0;inicio<=longitud;inicio++) {
		
			String caracter=Character.toString(numero.charAt(inicio));
			
			if(caracter.equals(".")) {
				es_double=true;
			}
		}
		return es_double;
	}
	
		
	private static boolean esInt(String numero) {
		boolean es_int=true;
		
		int longitud= numero.length();
		 
		for(int inicio=0;inicio<=longitud;inicio++) {
		
			String caracter=Character.toString(numero.charAt(inicio));
			
			if(caracter.equals(".")) {
				es_int=true;
			}
		}
		return es_int;
	}
	
	//verificacion completa --> metodo unifica verificaciones anteriores
		public static int verificarTipoDato(String terminar) {
			int tipo_dato;
			
			//esDouble
			boolean es_double=esDouble(terminar);
			//esInt
			boolean es_int=esInt(terminar);
			
			if(es_double==true) {
				tipo_dato=1;
			}else if(es_int==true) {
				tipo_dato=2;
			}else{
				tipo_dato=-1;
			}
			
			return tipo_dato;
		}
		
		
		/*métodos privados(no se pueden visualizar en otra clase) para convertir
		 * escaner de cadena, es decir, escaner de tipo String(nombre_escaner.nextLine()) a tipo dato necesitado:
		 * 
		 * tipo_dato_general.parsetipo_dato(varaible_tipo_String);
		 * 
		 * Hay varios tipo_dato_general:
		 * 
		 * String 	--> tipo_dato_general 	-->	String
		 * char 	--> tipo_dato_general 	-->	Character
		 * int 		--> tipo_dato_general 	-->	Integer
		 * double 	--> tipo_dato_general 	-->	Double
		 * float 	--> tipo_dato_general 	-->	Float
		 * 
		 * SYNTAXIS FINAL
		 * 
		 * String 	-->	String.parseString()
		 * char 	-->	Character.parseChar()
		 * int 		--> Integer.parseInt()
		 * double 	--> Double.parseDouble()
		 * float 	--> Float.parseFloat()
		 */
		
		private static double convertirDouble(String terminar) {
			return Double.parseDouble(terminar);
		}
		
		private static int convertirInt(String terminar) {
			return Integer.parseInt(terminar);
		}
		
		//metodo sumar para cada de los anteriores metodos
		
		public static double sumarDoubleHastaTerminar(String numero) {
			double contador=0;
			
			double terminar=convertirDouble(numero);
			
			while(contador<=terminar){
				contador=contador+terminar;
				contador=contador+1;
			}
			return contador;
		}
		
		public static int sumarIntHastaTerminar(String numero ) {
			int contador=0;
			int terminar=convertirInt(numero);
			while(contador<=terminar){
				contador=contador+terminar;
				contador=contador+1;
			}
			return contador;
		}
		
		//METODO PRINCIPAL
	public static void main(String[] args) {
		/**
		 * De la siguiente forma que se muestra nos podemos ahorrar el control de excepciones
		 * y el escribir tantas lineas de codigo
		 **/
		
		//variables
		String numero;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdzca un numero: ");
		numero=sc.nextLine();
		
		int tipo_dato=verificarTipoDato(numero);
		
		//Condiciones para la salida de tipo dato (redactado en la line 67-linea 84) y su correspondiente tratamiento
		
		if(tipo_dato==1) {
			System.out.println(sumarDoubleHastaTerminar(numero));
		}else if(tipo_dato==2) {
			System.out.println(sumarIntHastaTerminar(numero));
		}else {
			System.out.println("ERROR: valor no contemplado para realizar el sumatorio");
		}
				
		sc.close();

	}

}
