package buscaminas;

import java.util.ArrayList;

public class MatrizCasillas {
	private ArrayList<ArrayList<Casilla>> matriz;
	
	public MatrizCasillas() {
		matriz=new ArrayList<ArrayList<Casilla>>();
	}
	public MatrizCasillas(int x,int y){
		matriz=new ArrayList<ArrayList<Casilla>>();
		for (int i = 0; i < x; i++) {
			matriz.add(new ArrayList<Casilla>());
			for (int j = 0; j < y; j++) {
				matriz.get(i).add(new Casilla());
			}
		}
	}
	
	public int minasCercanas(int x,int y){
		int minaKop=0;		
		if(this.isMina(x-1, y-1))
			minaKop++;
		if(this.isMina(x-1, y))
			minaKop++;
		if(this.isMina(x-1, y+1))
			minaKop++;
		if(this.isMina(x, y-1))
			minaKop++;
		if(this.isMina(x, y+1))
			minaKop++;
		if(this.isMina(x+1, y-1))
			minaKop++;
		if(this.isMina(x+1, y))
			minaKop++;
		if(this.isMina(x+1, y+1))
			minaKop++;		
		return minaKop;
	}
	public Casilla getCasilla(int x, int y){
		return matriz.get(x).get(y);
	}
	public void SetCasillas(int x, int y){
		for (int i = 0; i < x; i++) {
			matriz.add(new ArrayList<Casilla>());
			for (int j = 0; j < y; j++) {
				matriz.get(i).add(new Casilla());
			}
		}
	}
	public boolean isMina(int x, int y){
		if(x<0 || x>matriz.size()-1 || y<0 || y>matriz.get(0).size()-1)
			return false;
		return matriz.get(x).get(y).isMina();
	}
	public void setMina(int x, int y){
		matriz.get(x).get(y).setMina(true);;
	}
	public void setMina(int x, int y,boolean mina){
		matriz.get(x).get(y).setMina(mina);;
	}
	
	public boolean isVisto(int x, int y) throws CasillaExecption {
		if(x<0 || x>matriz.size() || y<0 || y>matriz.get(0).size())
			throw new CasillaExecption("no existe esta casilla");
		return matriz.get(x).get(y).isVisto();
	}
	public void setVisto(int x, int y) throws CasillaExecption {
		if(this.isVisto(x, y))
			throw new CasillaExecption("esta casillas ya se ha visitado");
		matriz.get(x).get(y).setVisto(true);
	}
	public void setVisto(int x, int y,boolean visto) {
		matriz.get(x).get(y).setVisto(visto);
	}
	
	
}
