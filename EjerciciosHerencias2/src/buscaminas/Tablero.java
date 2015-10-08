package buscaminas;


import java.util.Random;

public class Tablero {
	private int maxBombas;
	MatrizCasillas matriz;
	
	public Tablero(int x,int y,int bombas) {
		maxBombas = bombas;
		matriz = new MatrizCasillas(10,10);
		ponerMinas();				
	}	
	public int pulsarCasilla(int x,int y)throws CasillaExecption{
		matriz.setVisto(x, y);
		if(matriz.isMina(x, y))
			return -1;
		else
			return minasCernanas(x, y);
	}
	public int minasCernanas(int x,int y){
		return matriz.minasCercanas(x, y);
	}
	private void ponerMinas() {
		Random r = new Random();
		int minaKont=0;
		int x,y ;
		while(minaKont<maxBombas){
			x = r.nextInt(9);
			y = r.nextInt(9);
			if(!matriz.isMina(x, y)){
				matriz.setMina(x, y);
				minaKont++;
			}
		}		
	}
	
}
