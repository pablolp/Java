package ejerciciosSentencias;

import java.util.Scanner;

public class NoRepetidos {
	
	Scanner teclado=new Scanner (System.in);
	
	boolean crearLista(int lista[]){
		boolean salir = false,repetido=false;
		int valor,kop=0;
		if(lista.length>0){
			do {
				System.out.print("Dame un Numero:");
				valor = teclado.nextInt();
				for(int i=0;i<kop;i++){
					if(valor == lista[i]){
						repetido=true;
						break;
					}
				}
				if(!repetido)
					lista[kop++]=valor;
				else{
					System.out.println("El numero "+valor+" esta repetido");
					repetido = false;
				}
				if(kop>=lista.length)
					salir = true;
				
			}while(!salir);
			return true;
		}
		else{
			return false;
		}
	}
	
	void escribirLista(int lista[]){
		for (int i = 0; i < lista.length; i++) {
			if (i!=0)
				System.out.print(lista[i]+ ", ");
			else 
				System.out.println(lista[i]);
		}
	
	}
		
	public void miMain(){
		int numeros[] = new int [10];
		crearLista(numeros);
		escribirLista(numeros);
	}
	public static void main(String[] args) {
		NoRepetidos programa = new NoRepetidos();
		programa.miMain();
		
	}
	

}
