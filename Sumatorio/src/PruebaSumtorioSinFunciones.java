import java.util.Scanner;
public class PruebaSumtorioSinFunciones {

	public static void main(String[] args) {
		//variables
		int terminar;
		int resultado=0;
		int contador=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdzca un numero: ");
		terminar=sc.nextInt();
		while(contador<=terminar){
			resultado=resultado+contador;
			contador=contador+1;
		}
		System.out.println(resultado);
		sc.close();
	}

}
