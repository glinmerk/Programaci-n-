package prueba;
import clases.Sumatorio;
import java.util.Scanner;

public class PruebaSumatorio {

	public static void main(String[] args) {
		/*
		 * Sumatorio de SOLO ENTEROS con menu para elegir el tipo de Sumtorio
		 * 
		 * ERROR: El escaner lanzará una excepcion --> java.utilinputMisMatch --> Valor introducido no de tipo entero o int
		 * 
		 * -->1. Normal
		 * -->2. Pares
		 * -->3.Inpares
		 * -->4. Primos
		 * -->5. Salir del programa
		 */
		
		/*
		 * 1º Declarar variables:
		 * - salir --> BOOLEAN
		 * - contador--> INT
		 * - terminar-->INT sin inicializar
		 * - sc --> SCANNER
		 * - opcion --> INT --> Decalarad en el bucle while del menu, seccion documentada en el siguiente apartado
		 * 
		 * 2º Crear menu con bucle WHILE --> Condiciones: salir=false-->while(salir==false){System.out.print("tipo de Sumtorio")}
		 * 
		 * 3º Dentro bucle while:
		 * - if y else if--> Condicion: opcion= tipo_sumatorio-->if(opcion==1) o else if(opcion==2) --> OPCION 1: Sumatorio Normal y viceversa
		 * 
		 * 4º Dentro de cada if y cada else if
		 * - Codigo a ejecutar
		 */
		
		//VARIABLES
		boolean salir=false;
		int terminar;
		Sumatorio sum=new Sumatorio();
		Scanner sc=new Scanner(System.in);
		
		//MENU
		while(salir==false) {
			
			//OPCIONES PROGRAMA
			System.out.println("1.Sumatorio normal\r"
					+ "2.Sumatorio pares\r"
					+ "3.Sumatorio impares\r"
					+ "4.Sumatorio primos\r"
					+ "5.Salir Sumatorio\r"
					+"opcion:");
			
			//ESCANER DE OPCIONES USUARIO
			int opcion=sc.nextInt();
			
			//VERIFICAR OPCION
			
			if(sum.verificarOpciones(opcion)==true) {
				
			//CONDICIONES para cada tipo de Sumatorio y su correspondiente codigo
			if(opcion==1) {
				//SUMATORIO NORMAL
				
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				System.out.println(sum.sumarHastaTerminar(terminar));
				
			}else if(opcion==2) {
				//SUMATORIO DE PARES
				
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				
				System.out.println(sum.sumarParesHastaTerminar(terminar));
				
			}else if(opcion==3) {
				//SUMATORIO IMPARES
				
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				
				System.out.println(sum.sumarInparesHastaTerminar(terminar));
			}else if(opcion==4) {
				//SUMATORIO PRIMOS
								
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				
				System.out.println(sum.sumarPrimosHastaTerminar(terminar));
				
			}else if(opcion==5) {
				//SALIR SUMATORIO
				System.out.println("INFO: Ha salido del programa con exito.");
				salir=true; //--> Salir del menu con la revlorizacion de salir
			}
			
		}else {
			System.out.println("ERROR: Opcion ineistente");
		}
		
	}
		sc.close();
}
}