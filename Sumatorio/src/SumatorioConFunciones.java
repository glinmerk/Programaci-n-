import java.util.Scanner;


public class SumatorioConFunciones {
	public static int sumarHastaTerminar(int terminar) {
		int contador=0;
		int resultado=0;
		while(contador<=terminar){
			resultado=resultado+contador;
			contador=contador+1;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		//variables
		int terminar;
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdzca un numero: ");
		terminar=sc.nextInt();
				
		System.out.println(sumarHastaTerminar(terminar));
		
		sc.close();

	}

}
