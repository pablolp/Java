package buscaminas;

public class Casilla {
	private int x,y;
	private boolean visto,mina;
	public Casilla(int posX,int posY) {
		x=posX;
		y=posY;
		visto = false;
		mina = false;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	public boolean isMina() {
		return mina;
	}
	public void setMina(boolean mina) {
		this.mina = mina;
	}
	
	
	
}
