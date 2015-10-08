package figuras;

public class Rectangulo extends Forma {
	private int base,altura;
	public Rectangulo(int x, int y,int base,int altura) {
		super(x, y);
		this.base = base;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rectangulo de posicion ( "+ getX()+ ","+getY()+ " ). base  = "+base + ", altura "+altura+" Area ="+getArea(); 
	}

	@Override
	protected double calcularArea() {
		return base*altura;
	}

}


