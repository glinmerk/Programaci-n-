package prueba;

import java.util.Scanner;

import clases.SumatorioScanerString;
import clases.Colores;
public class PruebaSumatorioScannerString {
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

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
		SumatorioScanerString sum=new SumatorioScanerString();
		Scanner sc=new Scanner(System.in);
		
		//MENU
		while(salir==false) {
			
			//OPCIONES PROGRAMA
			System.out.println(ANSI_WHITE_BACKGROUND+ANSI_RED+"[######## MENU ########]"
					+"1.Sumatorio normal\r"
					+ "2.Sumatorio pares\r"
					+ "3.Sumatorio impares\r"
					+ "4.Sumatorio primos\r"
					+ "5.Salir Sumatorio\r"
					+ANSI_RESET+"opcion:");
			
			//ESCANER DE OPCIONES USUARIO
			String opcion=sc.nextLine();
			
			if(sum.escanerCorrecto(opcion)==true) {
				
				int opcion_convertido=sum.convertirStringAInt(opcion);
				//VERIFICAR OPCION
				if(sum.verificarOpciones(opcion_convertido)==true) {
				
				//CONDICIONES para cada tipo de Sumatorio y su correspondiente codigo
				if(opcion_convertido==1) {
					//SUMATORIO NORMAL
					
					System.out.println("Introdzca un numero: ");
					String terminar=sc.nextLine();
					if(sum.escanerCorrecto(terminar)==true) {
						int terminar_convertido=sum.convertirStringAInt(terminar);
						System.out.println(sum.sumarHastaTerminar(terminar_convertido));
					}else {
						System.out.println("ERROR: Valores OPCION INCORRECTOS"+"INFO: Introduzca un VALOR NUMERICO");
					}
					
					
				}else if(opcion_convertido==2) {
					//SUMATORIO DE PARES
					
					System.out.println("Introdzca un numero: ");
					String terminar=sc.nextLine();
					if(sum.escanerCorrecto(terminar)==true) {
						int terminar_convertido=sum.convertirStringAInt(terminar);
						System.out.println(sum.sumarHastaTerminar(terminar_convertido));
					}else {
						System.out.println("ERROR: Valores OPCION INCORRECTOS"+"INFO: Introduzca un VALOR NUMERICO");
					}
					
				}else if(opcion_convertido==3) {
					//SUMATORIO IMPARES
					
					System.out.println("Introdzca un numero: ");
					String terminar=sc.nextLine();
					
					if(sum.escanerCorrecto(terminar)==true) {
						int terminar_convertido=sum.convertirStringAInt(terminar);
						System.out.println(sum.sumarHastaTerminar(terminar_convertido));
					}else {
						System.out.println("ERROR: Valores OPCION INCORRECTOS"+"INFO: Introduzca un VALOR NUMERICO");
					}
				}else if(opcion_convertido==4) {
					//SUMATORIO PRIMOS
									
					System.out.println("Introdzca un numero: ");
					String terminar=sc.nextLine();
					
					if(sum.escanerCorrecto(terminar)==true) {
						int terminar_convertido=sum.convertirStringAInt(terminar);
						System.out.println(sum.sumarHastaTerminar(terminar_convertido));
					}else {
						System.out.println("ERROR: Valores OPCION INCORRECTOS"+"INFO: Introduzca un VALOR NUMERICO");
					}
					
				}else if(opcion_convertido==5) {
					//SALIR SUMATORIO
					System.out.println("INFO: Ha salido del programa con exito.");
					salir=true; //--> Salir del menu con la revlorizacion de salir
				}
			
			}else {
				System.out.println("ERROR: Opcion ineistente");
			}
		}else {
			System.out.println("ERROR: Valores OPCION INCORRECTOS"+"INFO: Introduzca un VALOR NUMERICO");
		}
	}
		sc.close();
}
}

