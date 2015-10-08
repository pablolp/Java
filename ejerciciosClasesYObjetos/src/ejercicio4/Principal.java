package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		Boleto boletos[] = new Boleto[10];
		Boleto ganador = new Boleto(true);
		ganador.mostrar();
		for (int i = 0; i <3; i++) {
			boletos[i]=new Boleto();
		}
		for (int i = 0; i <3; i++) {
			boletos[i].comprobarBoleto(ganador);
		}
	}

}
