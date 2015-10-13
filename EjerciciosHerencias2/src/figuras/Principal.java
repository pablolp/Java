package figuras;

import java.util.ArrayList;

public class Principal {
	ArrayList<Forma> formas ;
	public Principal() {
		// TODO Auto-generated constructor stub
		formas = new ArrayList<Forma>();
	}
	public static void main(String[] args) {
		Principal programa = new Principal();
		programa.formas.add(new Circulo(9,6,1));
	}

}
