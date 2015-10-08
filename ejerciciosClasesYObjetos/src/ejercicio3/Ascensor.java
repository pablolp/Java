package ejercicio3;

public class Ascensor {
	private boolean puerta;//false cerrada,true abierta
	private int piso;
	
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public Ascensor() {
		puerta = false;
		piso =0;
	}
	public boolean irPiso(int piso){
		if(!puerta){
			puerta = true;
			this.piso=piso;	
			puerta = false;
			return true;
		}else
			return false;
	}
	
}
