package ejercicio4;

public abstract class Jugador {
	protected int max;
	private int cantidad,apuesta;
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getApuesta() {
		return apuesta;
	}
	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}
	public Jugador(int max) {
		this.max=max;
		cantidad=0;
		apuesta=0;
	}
	public abstract void hacerApuesta();
	public abstract void guardarCantidad();
}
