package conexcepcion;
import java.util.Scanner;
public class PruebaSumtorioSinFunciones {

	public static void main(String[] args) {
		//variables
		int terminar=0;
		int contador=0;
		boolean mensajeerror=true;
		
		/*realizamos un bucle while con el mensaje error
		 * --> Defautl true para que pueda iterar
		 * 
		 * Una vez dentro se utilizara para:
		 * - Entrar --> mensajeerror=true
		 * - Salir --> mensajeerror=false
		*/
		
		while(mensajeerror==true){
			//Declaramos un escaner dentro del while
			Scanner sc=new Scanner(System.in);
			
			//estructura para coger la excepcion
				try{
					//codigo completo a ejecuar
					System.out.println("Introdzca un numero: "); //mensaje para el usuario
					terminar=sc.nextInt();//escaner para el usuario introduzca el valor
					
					//iterdor de suma consecutiva
					while(contador<=terminar){
						contador=contador+terminar;
						contador=contador+1;
					}
					//imprimir resultado
					System.out.println(contador);
					
					//volvemos false ya que este apartado solo se ejecuta si no se lanza la excepcion de la linea (36)
					mensajeerror=false;
					sc.close();					
				}catch(java.util.InputMismatchException e) {//Excepcion a recoger y su tratamiento
					System.out.println("ERROR: Valor introducido o es entero");//Mensaje de error cuando salta la excepcion --> java.util.InputMismatchException
					mensajeerror=true;//Volver a ejecutar bucle while 
				}
			
		}
		
		/*
		 * NO SE UTILIZA EL METODO nombre_escaner,hasNext_tipodato_ ya que produce:
		 * - Un bucle infinito
		 * - No lee mas lineas
		 * 
		 * NUNCA TERMINA LA EJECUCUION DEL PROGRAMA
		 */
		
	}

}
