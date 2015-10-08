package figuras;

public class Triangulo extends Forma {
	private int base,altura;
	public Triangulo(int x, int y,int base,int altura) {
		super(x, y);	
		this.base = base;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Triangulo de posicion ( "+ getX()+ ","+getY()+ " ). base  = "+base + ", altura "+altura+" Area ="+getArea(); 
	}

	@Override
	protected double calcularArea() {
		return (altura*base)/2;
	}

}
