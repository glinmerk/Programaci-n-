package clases;

public class Sumatorio {

	public Sumatorio(int contador, int terminar, int opcion) {
		super();
		this.contador = contador;
		this.terminar = terminar;
		this.opcion = opcion;
	}

	private int contador;
	private int terminar;
	private int opcion;
	
	public Sumatorio() {
		super();
		this.contador = contador;
		this.terminar = terminar;
		this.opcion = opcion;
	}
	
	
	//VERIFICACION OPCION
	public boolean  verificarOpciones(int opcion) {
		boolean existe_opcion=true;
		if(opcion<1&&opcion>5) {
			existe_opcion=false;
		}
		return existe_opcion;
	}
	
	public boolean contadorEsPrimo(int contador,int terminar) {
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
	
	
	private boolean contadorEsPar(int contador) {
		boolean es_par=false;
		if(contador%2==0) {
			es_par=true;
		}
		return es_par;		
	}
	
	private boolean contadorEsInpar(int contador) {
		boolean es_inpar=false;
		if(contador%2==1) {
			es_inpar=true;
		}
		return es_inpar;		
	}
	
	public int getContador() {
		return contador;
	}


	public int getTerminar() {
		return terminar;
	}


	public int getOpcion() {
		return opcion;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	public void setTerminar(int terminar) {
		this.terminar = terminar;
	}


	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	
	
	//METODOS DE SUMATORIO
	
	public int sumarHastaTerminar(int terminar) {
		int contador=0;
		int resultado=0;
		while(contador<=terminar){
			resultado=contador+terminar;
			contador=contador+1;
		}
		return resultado;
	}
	
	public int sumarParesHastaTerminar(int terminar) {
		int contador=2;
		int resultado=0;
		//contara de dos en dos --> Siendo asi suma de pares
		while(contador<=terminar){
			boolean es_par=contadorEsPar(contador);
			if(es_par==true) {
				resultado=contador+terminar;
				contador=contador+1;
			}else {
				contador++;
			}
		}
		
		return resultado;
	}
	
	public int sumarInparesHastaTerminar(int terminar) {
		int contador=1;
		int resultado=0;
		while(contador<=terminar){
			boolean es_inpar=contadorEsInpar(contador);
			if(es_inpar==true) {
				resultado=contador+terminar;
				contador=contador+1;
			}
		}
		return resultado;
	}
	
	public int sumarPrimosHastaTerminar(int terminar) {
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
			}
			contador++;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Sumatorio [contador=" + contador + ", terminar=" + terminar + ", opcion=" + opcion + ", getContador()="
				+ getContador() + ", getTerminar()=" + getTerminar() + ", getOpcion()=" + getOpcion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}