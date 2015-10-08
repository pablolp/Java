package ejercicio1;

import java.util.Scanner;

public class Hora {
	int hora;
	int minuto;
	Scanner teclado=new Scanner (System.in);
	public Hora(int hora,int minuto){
		if(minuto>=0 && minuto<60){
			this.hora = hora;
			this.minuto = minuto;
		}else{
			System.err.println("Minutuak 0 baino handiagoak eta 60 baino txikiagoak izan behar dira");
		}
	}
	public int diferencia(Hora b){
		int minutosTotales = hora*60+minuto;
		int ret = minutosTotales - (b.hora*60 + b.minuto);
		return Math.abs(ret);
	}
	public void leerHora(){
		System.out.print(hora+" : "+minuto);
	}
	public static void main(String[] args) {
		Hora a = new Hora(1,20);
		Hora b = new Hora(0,50);
		int dif = a.diferencia(b);
		System.out.println(dif);
		
	}

}
