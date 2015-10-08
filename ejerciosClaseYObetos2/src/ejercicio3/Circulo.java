package ejercicio3;

public class Circulo {
	public int getCx() {
		return cx;
	}
	public int getCy() {
		return cy;
	}
	private int cx, cy,radio;
	public Circulo(int x,int y,int radio){
		cx=x;
		cy = y;
		this.radio = radio;
	}
	public boolean colisiona(int x, int y){
		double dif;
		dif= Math.sqrt(Math.pow(cx-x,2)+Math.pow(cy-y, 2));
		return (dif <= radio);
	}
}
