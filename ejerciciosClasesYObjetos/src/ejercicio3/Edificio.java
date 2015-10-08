package ejercicio3;

import java.util.Scanner;

public class Edificio {
	int pisos;
	Ascensor ascensores[];
	static Scanner teclado = new Scanner (System.in);
	public Edificio() {
		pisos = 10;
		ascensores = new Ascensor[3];
		ascensores[0] = new Ascensor();
		ascensores[1] = new Ascensor();
		ascensores[2] = new Ascensor();
	}
	public void llamarAscensor(int desde,int hasta){
		int ascensorID=0,piso,diferencia;
		if(desde >=0 && desde<=pisos && hasta >=0 && hasta<=pisos){
			piso = ascensores[0].getPiso();
			diferencia =Math.abs(piso - desde) ;
			for (int i = 1; i < ascensores.length; i++) {
				if (Math.abs(ascensores[i].getPiso()-desde)<diferencia){
					diferencia = Math.abs(ascensores[i].getPiso()-desde);
					piso = ascensores[i].getPiso();
					ascensorID =i;
				}				
			}
			System.out.println("El ascensor "+ascensorID+" del piso "+ascensores[ascensorID].getPiso()+" esta en camino");
			ascensores[ascensorID].setPiso(hasta);
			System.out.println("El ascensor "+ascensorID+" se ha movido a el piso "+ascensores[ascensorID].getPiso());
		}
	}
	
	public static int menu(){
		System.out.println("1. Llamar ascensor");
		System.out.println("2. Ir a piso");
		System.out.println("0. Salir");
		return teclado.nextInt();
	}
	public static void main(String[] args) {
		Edificio edificio = new Edificio();
		int desde,hasta;
		boolean irten = false;
		do{
		switch(menu()){
			case 0:irten = true;	break;
			case 1:
				System.out.println("desde que piso quies llamar?");
				desde = teclado.nextInt();
				System.out.println("A que piso quieres ir?");
				hasta = teclado.nextInt();
				edificio.llamarAscensor(desde,hasta);
				break;
			case 2:
				System.out.println("Que ascenso quieres usar?");
				for (int i = 0; i < edificio.ascensores.length; i++) {
					System.out.println("El ascensor "+i+" esta en el piso "+edificio.ascensores[i].getPiso());
				}
				desde = teclado.nextInt();
				System.out.println("A que piso quiere ir?");
				hasta = teclado.nextInt();
				edificio.ascensores[desde].setPiso(hasta);
				System.out.println("El ascensor '"+desde+" se ha movido a el piso "+edificio.ascensores[desde].getPiso());
				break;
			default:	break;
					
			}
		}while(!irten);
	}
}
	