package ejercicio1;

import java.util.Scanner;

public class Banco {
	private Cuenta cuentas[];
	private int numCuentas;
	static Scanner teclado = new Scanner(System.in);
	public Banco() {
		cuentas = new Cuenta[100];
		numCuentas=0;
	}
	public boolean nuevaCuenta(int num,int saldo,String nombre){
		if(num>0 && saldo >0 && nombre!=""){
			cuentas[numCuentas]= new Cuenta(num,saldo,nombre);
			System.out.println("Se ha creado una cuenta:"+cuentas[numCuentas]);
			numCuentas++;
			return true;
		}
		else{
			System.err.println("Error en los tipos basicos");
			return false;
		}		
	}
	public void mostrarTodos(){
		for (int i = 0; i < numCuentas; i++) {
			System.out.println(">"+cuentas[i]);
		}
	}
	public static int menu(){
		System.out.println("1-> Crear nueva cuenta");
		System.out.println("2-> Operacion en la cuenta");
		System.out.println("3-> Ver todas las cuentas");
		System.out.println("4-> Realizar transferencia");
		System.out.println("0-> Salir");
		return teclado.nextInt();
	}
	public static void main(String[] args) {
		Banco banco = new Banco();
		boolean jarraitu = true;
		int num, saldo,cantidad;
		String nombre,destino;
		do{
			switch (menu()) {
			case 0:		
				jarraitu = false;
				break;
			case 1:		
				System.out.println("Cual es el nombre del titular?");
				teclado.nextLine();
				nombre = teclado.nextLine();
				System.out.println("cual es el nuemro de la cuenta a crear?");
				num = teclado.nextInt();
				System.out.println("Cual es el saldo con de la cuenta?");
				saldo = teclado.nextInt();
				banco.nuevaCuenta(num, saldo, nombre);
				break;
			case 2:			
				System.out.println("Cual es el nombre del titular?");
				teclado.nextLine();
				nombre = teclado.nextLine();
				for (int i = 0; i < banco.numCuentas; i++) {
					if(nombre.compareTo(banco.cuentas[i].getTitular())==0){
						banco.cuentas[i].gestionarCuenta();
					}
				}
				break;
			case 3:		
				for (int i = 0; i < banco.numCuentas; i++) {
					System.out.println(banco.cuentas[i]);
				}
				break;
			case 4:
				System.out.println("Cual es el nombre del titular?");
				teclado.nextLine();
				nombre = teclado.nextLine();
				for (int i = 0; i < banco.numCuentas; i++) {
					if(nombre.compareTo(banco.cuentas[i].getTitular())==0){
						System.out.println("Cual es el nombre al que le quieres hace la transferencia?");
						
						destino = teclado.nextLine();
						for (int j = 0; j < banco.numCuentas; j++) {
							if(destino.compareTo(banco.cuentas[j].getTitular())==0){
								System.out.println("Cuanto le quieres transferir?");
								cantidad = teclado.nextInt();
								banco.cuentas[i].transferir(banco.cuentas[j], cantidad);
							}
						}
					}
				}
				break;
			default:
				break;
			}
		}while(jarraitu);
	}
}
