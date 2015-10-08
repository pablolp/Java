package figuras;

public class Circulo extends Forma {
	private int radio;
	public Circulo(int x, int y,int radio) {
		super(x, y);
		this.radio = radio;
	}


	@Override
	public String toString() {
		return "Circulo de posicion ( "+ getX()+ ","+getY()+ " ) radio = "+radio+" Area ="+getArea(); 
	}


	@Override
	protected double calcularArea() {
		double ret = 3.1415*(double)Math.pow(radio, 2);
		return ret;
	}

}
