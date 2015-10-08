package figuras;

public class Cuadrado extends Forma {
	int lado;
	public Cuadrado(int x, int y,int lado) {
		super(x, y);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cuadrado de posicion ( "+ getX()+ ","+getY()+ " ). Lado  = "+lado+" Area ="+getArea(); 
	}

	@Override
	protected double calcularArea() {
		return lado*lado;
	}

}
