package ejercicio3;

public abstract class Electrodomestico {
	boolean estado ;//apagado = false , encendido = true

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public Electrodomestico() {
		estado = false;
	}

	@Override
	public abstract String toString();
}
