package conmenusoloint;
import java.util.Scanner;


public class SumatorioConFunciones {
	
	//VERIFICACIONES
	public static boolean  verificarOpciones(int opcion) {
		boolean existe_opcion=true;
		if(opcion<1&&opcion>5) {
			existe_opcion=false;
		}
		return existe_opcion;
	}
	
	public static boolean contadorEsPrimo(int contador,int terminar) {
		boolean es_primo=true;
		boolean salir=false;
		//IR DESDE i hasta terminar 
		for(int i=0;i<=terminar&&salir==false;i++) {
			
			//COMPROBAR SI EL RESTO ES CERO
			//SI EL NUMERO ACTUAL es divisible entre un numero distinto de contador y 1
			if(i!=contador&&contador%i==0) {
				es_primo=false;
				salir=true;
			}else if(contador==i) {
				es_primo=true;
				salir=true;
			}
			
		}
		return es_primo;
	}
	
	//METODOS SUMAR
	public static int sumarHastaTerminar(int terminar) {
		int contador=0;
		while(contador<=terminar){
			contador=contador+terminar;
			contador=contador+1;
		}
		return contador;
	}
	
	public static int sumarParesHastaTerminar(int terminar) {
		int contador=2;
		//contara de dos en dos --> Siendo asi suma de pares
		while(contador<=terminar){
			
			contador=contador+terminar;
			contador=contador+2;
		}
		
		return contador;
	}
	
	public static int sumarInparesHastaTerminar(int terminar) {
		int contador=1;
		while(contador<=terminar){
			if(contador%2==1) {
				contador=contador+terminar;
				contador=contador+1;
			}
		}
		return contador;
	}
	
	public static int sumarPrimosHastaTerminar(int terminar) {
		int contador=2;
		int resultado=0;
		while(contador<=terminar) {
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
		return contador;
	}
	
	public static boolean salirSumatorio(boolean salir) {
		return salir=true ;
	}
	
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
		Scanner sc=new Scanner(System.in);
		
		//MENU
		while(salir==false) {
			
			//OPCIONES PROGRAMA
			System.out.println("1.Sumatorio normal\n\r"
					+ "2.Sumatorio pares\n\r"
					+ "3.Sumatorio impares\n\r"
					+ "4.Sumatorio primos\n\r"
					+ "5.Salir Sumatorio");
			
			//ESCANER DE OPCIONES USUARIO
			int opcion=sc.nextInt();
			
			//VERIFICAR OPCION
			
			if(verificarOpciones(opcion)==true) {
				
			//CONDICIONES para cada tipo de Sumatorio y su correspondiente codigo
			if(opcion==1) {
				//SUMATORIO NORMAL
				
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				System.out.println(sumarHastaTerminar(terminar));
				
			}else if(opcion==2) {
				//SUMATORIO DE PARES
				
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				
				System.out.println(sumarParesHastaTerminar(terminar));
				
			}else if(opcion==3) {
				//SUMATORIO IMPARES
				
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				
				System.out.println(sumarInparesHastaTerminar(terminar));
			}else if(opcion==4) {
				//SUMATORIO PRIMOS
								
				System.out.println("Introdzca un numero: ");
				terminar=sc.nextInt();
				
				System.out.println(sumarPrimosHastaTerminar(terminar));
				
			}else if(opcion==5) {
				//SALIR SUMATORIO
				System.out.println("INFO: Ha salido del programa con exito.");
				salir=salirSumatorio(salir); //--> Salir del menu con la revlorizacion de salir
			}
			
		}else {
			System.out.println("ERROR: Opcion ineistente");
		}
		
	}
		sc.close();
}
}
