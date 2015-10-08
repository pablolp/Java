package ejercicio3;

public class Bala {
	private int x,y,grados;
	public Bala(int x,int y,int grados){
		this.x=x;
		this.y = y;
		grados = 0;
	}
	public int getGrados() {
		return grados;
	}
	public void setGrados(int grados) {
		this.grados = grados;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
