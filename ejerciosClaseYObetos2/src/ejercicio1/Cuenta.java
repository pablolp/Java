package ejercicio1;

public class Cuenta {
	
	private int numero;
	private int saldo;
	private String titular;
	public Cuenta(int numeroDeCuenta,int saldoInicial,String nombreTitular) {
		numero = numeroDeCuenta;
		saldo = saldoInicial;
		titular = nombreTitular;
	}
	private void ingresar(int cantidad){
		saldo += cantidad;
		System.out.println("Se ha ingresado: "+cantidad);
	}
	private void mostrarSaldo(){
		System.out.println("Su saldo actual es: "+saldo);
	}
	private boolean retirarDinero(int cantidad){
		if(cantidad<= saldo){
			System.out.println("Se ha retirado: "+cantidad+"€");
			return true;
		}
		else{
			System.out.println("No tiene Suficiente dinero.");
			return false;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "La cuenta de "+titular+" del numero: "+numero+" tiene "+saldo+"€";
	}
	public boolean transferir (Cuenta destino,int cantidad){
		if(cantidad<= saldo){
			this.saldo -= cantidad;
			destino.ingresar(cantidad);
			System.out.println("Se ha transferido "+cantidad+"€ de la cuenta de "+titular+" a la cuenta de "+destino.titular);;
			return true;
		}
		else{
			System.out.println("La cuenta de "+titular+" no tiene saldo suficiente");
			return false;
		}
	}
	public String getTitular() {
		return titular;
	}
	public void gestionarCuenta(){
		int cantidad;
		boolean jarraitu = true;
		do {
		System.out.println("1-> Ingresar Dinero");
		System.out.println("2-> Retirar Dinero");
		System.out.println("3-> Ver Saldo");
		System.out.println("0-> Salir");
		switch (Banco.teclado.nextInt()) {
		case 0:		
			jarraitu = false;
			break;
		case 1:			
			System.out.println("Cuanto dinero quieres ingresar?");
			cantidad = Banco.teclado.nextInt();
			this.ingresar(cantidad);
			break;
		case 2:			
			System.out.println("Cuanto dinero quieres sacar");
			cantidad = Banco.teclado.nextInt();
			this.retirarDinero(cantidad);
			break;
		case 3:			
			this.mostrarSaldo();
			break;
		default:
			break;
		}
		}while (jarraitu);
	}
	
}
