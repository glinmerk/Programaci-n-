package conexcepcion;
import java.util.Scanner;


public class SumatorioConFunciones {
	public static int sumarHastaTerminar(int terminar) {
		int contador=0;
		while(contador<=terminar){
			contador=contador+terminar;
			contador=contador+1;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		//variables
		boolean mensajeerror=true;		
		int terminar=0;	
				
				/*realizamos un bucle while con la comprobacion
				 * --> Defautl false para que pueda iterar
				 */
				while(mensajeerror==true){
					//Declaramos un escaner dentro del while
					Scanner sc=new Scanner(System.in);
					
					//estructura para coger la excepcion
						try{
							//codigo completo a ejecuar
							System.out.println("Introdzca un numero: ");
							terminar=sc.nextInt();
							
							System.out.println(sumarHastaTerminar(terminar));						
							//volvemos false ya que este apartado solo se ejecuta si no se lanza la excepcion de la linea (36)
							mensajeerror=false;
							sc.close();
						}catch(java.util.InputMismatchException e) {//Excepcion a recoger y su tratamiento
							System.out.println("ERROR: Valor introducido o es entero");//Mensaje de error cuando salta la excepcion --> java.util.InputMismatchException
							mensajeerror=true;//Volver a ejecutar bucle while
						}
				}
				
				
	/*
	 * NO SE UTILIZA EL METODO nombre_escaner.hasNext_tipodato_ ya que produce:
	 * - Un bucle infinito
	 * - No lee mas lineas
	 * 
	 * NUNCA TERMINA LA EJECUCUION DEL PROGRAMA
	 */

	}

}
