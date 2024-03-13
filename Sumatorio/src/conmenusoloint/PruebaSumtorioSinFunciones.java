package conmenusoloint;
import java.util.Scanner;
public class PruebaSumtorioSinFunciones {

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
		boolean salir_menu=false;
		Scanner sc=new Scanner(System.in);
		
		//MENU
		while(salir_menu==false) {
			
			//OPCIONES PROGRAMA
			System.out.println("1.Sumatorio normal\n\r"
					+ "2.Sumatorio pares\n\r"
					+ "3.Sumatorio impares\n\r"
					+ "4.Sumatorio primos\n\r"
					+ "5.Salir Sumatorio");
			
			//ESCANER DE OPCIONES USUARIO
			int opcion=sc.nextInt();
			
			//CONDICIONES para cada tipo de Sumatorio y su correspondiente codigo
			if(opcion==1) {
				//SUMATORIO NORMAL
				
				System.out.println("Introdzca un numero: ");
				int terminar_normal=sc.nextInt();
				int contador=0;
				while(contador<=terminar_normal){
					contador=contador+terminar_normal;
					contador=contador+1;
				}
				System.out.println(contador);
				
			}else if(opcion==2) {
				//SUMATORIO DE PARES
				int terminar_pares;
				System.out.println("Introdzca un numero: ");
				terminar_pares=sc.nextInt();
				int contador=2;
				//contara de dos en dos --> Siendo asi suma de pares
				while(contador<=terminar_pares){
					
					contador=contador+terminar_pares;
					contador=contador+2;
				}
				System.out.println(contador);
				
			}else if(opcion==3) {
				//SUMATORIO IMPARES
				int terminar_inpares;
				System.out.println("Introdzca un numero: ");
				terminar_inpares=sc.nextInt();
				int contador=1;
				while(contador<=terminar_inpares){
					if(contador%2==1) {
						contador=contador+terminar_inpares;
						contador=contador+1;
					}
				}
				System.out.println(contador);
			}else if(opcion==4) {
				//SUMATORIO PRIMOS
				int terminar_primos;
				System.out.println("Introdzca un numero: ");
				terminar_primos=sc.nextInt();
				int resultado=0;
				int contador=2;
				
				while(contador<=terminar_primos) {
					boolean primo=false;
					boolean salir=false;
					for(int dividendo=2;dividendo<=contador&&salir==false;dividendo++) {
						
						//si dividendo es contador y es divisible --> No es primo
						if(dividendo!=contador&&contador%dividendo==0) {
							primo=false;
							salir=true;
						}else if(contador==dividendo) {
							primo=true;
							salir=true;
						}
					}
					if(primo==true) {
						resultado=resultado+contador;
						System.out.println(resultado);
					}
					contador++;
				}
				
			}else if(opcion==5) {
				//SALIR SUMATORIO
				
				salir_menu=true; //--> Salir del menu con la revlorizacion de salir
			}else {
				//OPCIONES NO CONTEMPLADAS --> Usuario escribe un numero mayor y/o menor a 1 que las opciones
				System.out.println("ERROR: Opcion no contemplada");
			}
			
		}
		
		sc.close();
	}

}
