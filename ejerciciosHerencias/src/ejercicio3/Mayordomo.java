package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Mayordomo {
	ArrayList<Electrodomestico> aparatos;
	Scanner teclado;
	public Mayordomo() {
		aparatos = new ArrayList<Electrodomestico>();
		teclado = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Mayordomo alfonso = new Mayordomo();
		boolean salir = false;
		do {
			alfonso.menu();
			switch (alfonso.teclado.nextInt()) {
			case 1:
				alfonso.teclado.nextLine();
				alfonso.crearElectrodomestico();
				break;
			case 2:
				alfonso.administrarElectrodomesticos();
				break;
			case 0:
				salir = true;
			default:
				break;
			}
		} while (!salir);
	}

	private void administrarElectrodomesticos() {
		int opcion;
		mostrarElectrodomesticos();
		opcion = teclado.nextInt()-1;
		teclado.nextLine();
		if(aparatos.get(opcion).isEstado()){
			System.out.println("El aparato esta encendido, quiere apagarlo? (S/N)");
			if("S".compareToIgnoreCase(teclado.nextLine())==0)
				aparatos.get(opcion).setEstado(false);
		}
		else{
			System.out.println("El aparato esta apagado, quiere encenderlo? (S/N)");
			if("S".compareToIgnoreCase(teclado.nextLine())==0)
				aparatos.get(opcion).setEstado(true);
		}
	}

	private void mostrarElectrodomesticos() {
		ListIterator<Electrodomestico> it = aparatos.listIterator();
		
		int kont=1;
		while(it.hasNext()){
			System.out.println((kont++)+"-> " +it.next().toString());
		}
		
	}

	private void crearElectrodomestico() {
		String opcion;
		System.out.println("Que electrodomestico quieres crear? ( Lavadora / Secadora )");
		opcion = teclado.nextLine();
		switch (opcion.toUpperCase()) {
		case "LAVADORA":
			aparatos.add(new Lavadora());
			break;
			
		case "SECADORA":
			aparatos.add(new Secadora());
			break;


		default:
			System.out.println("Opcion no disponible.");
			break;
		}
		
		
	}

	private int menu() {
		System.out.println("1-> Crear Electrodomestico");
		System.out.println("2-> Administrar Electrodomestico");
		System.out.println("0-> Salir");
		return 0;
	}
}
