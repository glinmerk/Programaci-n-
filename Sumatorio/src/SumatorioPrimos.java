import java.util.Scanner;
public class SumatorioPrimos {
	
	public static void main(String[] args) {
		//SUMATORIO PRIMOS
		
		//variables
		Scanner sc=new Scanner(System.in);
		int terminar;
		
		System.out.println("Introdzca un numero: ");
		terminar=sc.nextInt();
		int resultado=0;
		int contador=2;
		
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
		sc.close();
	}
}
