package sumatorio;
import java.util.Scanner;
public class PruebaSumatorioFunciones {

	public static boolean esInt(String fin_contar) {
		boolean es_int=false;
		
		//almacenar entero en una variable tipo String
		//String numero_determinar=String.valueOf(fin_contar);
		
		/*Con bucle for para determianr el tipo de dato
		 for(int i=0;i<=numero_determinar.length();i++){
		 String caracter=String.valueOf(numero_determinar.charAt(i));
		 if(caracter.equals(".")){
		 es_float=true;
		 }
		 }
		 */
		
		//con contains busca de forma automatica el caracter a encontrar
			
		if(fin_contar.contains(".")==false) {
			es_int=true;
		}		
		return es_int;
	}
	
	public static boolean esFloat(String fin_contar) {
		boolean es_float=false;
		
		//almacenar entero en una variable tipo String
		//String numero_determinar=String.valueOf(fin_contar);
		
		/*Con bucle for para determianr el tipo de dato
		 for(int i=0;i<=numero_determinar.length();i++){
		 String caracter=String.valueOf(numero_determinar.charAt(i));
		 if(caracter.equals(".")){
		 es_float=true;
		 }
		 }
		 */
		
		//con contains busca de forma automatica el caracter a encontrar
			
		if(fin_contar.contains(".")) {
			es_float=true;
		}		
		return es_float;
	}
	
	public static boolean esDouble(String fin_contar) {
		boolean es_double=false;
		//almacenar entero en una variable tipo String
				//String numero_determinar=String.valueOf(fin_contar);
				
				/*Con bucle for para determianr el tipo de dato
				 for(int i=0;i<=numero_determinar.length();i++){
				 String caracter=String.valueOf(numero_determinar.charAt(i));
				 if(caracter.equals(".")){
				 es_float=true;
				 }
				 }
				 */
				
				//con contains busca de forma automatica el caracter a encontrar
					
				if(fin_contar.contains(".")) {
					es_double=true;
				}
		return es_double;
	}
	
	public static int sumarHasta(int final_numero) {
		int resultado=0;
		int contador=1;
		//sumar hasta fin
		while(resultado<=final_numero) {
			resultado=resultado+contador;
			contador=contador+1;
		}
		return resultado;
	}
/*	
	public static double sumarHasta(double final_numero) {
		double resultado=0;
		double contador=1;
		//sumar hasta fin
		while(resultado<=final_numero) {
			resultado=resultado+contador;
			contador=contador+1;
		}
		return resultado;
	}
*/	
/*	public static float sumarHasta(float final_numero) {
		float resultado=0;
		float contador=1;
		//sumar hasta fin
		while(resultado<=final_numero) {
			resultado=resultado+contador;
			contador=contador+1;
		}
		return resultado;
	}
	*/
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
		String terminar;
		Scanner sc=new Scanner(System.in);

		//usuario introduce un valor
		System.out.println("Numero final: ");
		terminar=sc.nextLine();
		
		//comprobar que se ah introduce un valor en el escaner terminar
			if(terminar.isEmpty()==false) {
				//verificar tipo dato float
				boolean es_float=esFloat(terminar);
				//verificar tipo dato double
				boolean es_double=esFloat(terminar);
				//verificar tipo dato int
				boolean es_int=esInt(terminar);
				
				//iteracion de funcion a realizar
				if(es_float==true&&es_double==true){
					System.out.println("ERROR: No ha introduciso valor numerico NO ENTERO");
				}else if(es_float==false&&es_double==false&&es_int==true) {
					System.out.println("Numero final: ");
					//pasar String a tipo dato int(entero)
					int final_numero=Integer.parseInt(terminar);
					//ejecutar funcion de sumarHasta
					System.out.println(sumarHasta(final_numero));
				}
				
				/*iteracion de funciones segun el tipo de salida de cada verificacion de tipo dato
				if(es_float==true) {
					System.out.println("Numero final: ");
					float final_numero_double=FLoat.parseFloat(terminar);
					System.out.println(sumarHasta(final_numero_double));
				}else if(es_double==true) {
					System.out.println("Numero final: ");
					double final_numero_double=Double.parseDouble(terminar);
					System.out.println(sumarHasta(final_numero_double));
				}else if(es_int==true) {
					System.out.println("Numero final: ");
					int final_numero=Integer.parseInt(terminar);
					System.out.println(sumarHasta(final_numero));
				}else{
					System.out.println("ERROR: No ha introduciso ningun valor numerico");
				}
				*/
		}else{
			System.out.println("ERROR: No ha introduciso ningun valor numerico");	
		}
		sc.close();

	}

}
