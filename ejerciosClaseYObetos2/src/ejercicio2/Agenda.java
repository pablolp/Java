package ejercicio2;

import java.util.Scanner;

public class Agenda {
	final int MAX_CONTACTOS = 10;
	Contacto contactos[] = new Contacto[MAX_CONTACTOS];
	Scanner teclado = new Scanner (System.in);
	int numContactos;
	public Agenda() {
		numContactos = 0;
	}
	public int menu(){
		System.out.println("1-> Nuevo contacto");
		System.out.println("2-> Buscar Contacto");
		System.out.println("0-> Salir");
		return teclado.nextInt();
	}
	void nuevoContacto(){
		int num;
		String nombre;
		System.out.println("Dame el numero");
		num = teclado.nextInt();
		System.out.println("Nombre del Contacto");
		teclado.nextLine();
		nombre = teclado.nextLine();
		contactos[numContactos++]=new Contacto(nombre,num);		
	}
	void buscarContacto(){
		String nombre;
		System.out.println("Cual es el nombre dek contacto?");
		teclado.nextLine();
		nombre = teclado.nextLine();
		for (int i = 0; i < numContactos; i++) {
			if(nombre.compareTo(contactos[i].getNombre())== 0 ){
				System.out.println("El numero de "+contactos[i].getNombre()+" es: "+contactos[i].getNum());
				break;
			}
		}
	}
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		boolean irten=false;
		do{
			switch (agenda.menu()) {
			case 0:	
				irten = true;
				break;
			case 1:			
				agenda.nuevoContacto();
				break;
			case 2:				
				agenda.buscarContacto();
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(!irten);
	}
}
