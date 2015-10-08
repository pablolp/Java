package ejercicio1;

public class Hora {
	protected int hora,minutos;
	public Hora(int h,int m) {
		hora=h;
		minutos=m;
	}
	public int comparar(Hora b){
		int ret;
		if(hora<b.hora)
			ret= 1;
		else if(hora >b.hora)
			ret= -1;
		else if(minutos<b.minutos)
			ret =1;
		else if(minutos > b.minutos)
			ret = -1;
		
		else if((b instanceof HorasPrecisas))
			if (((HorasPrecisas) b).segundos == 0)
				ret= 0;
			else
				ret= 1;
		else 
			ret = 0;  
		return ret;			
	}
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + "]";
	}
	
}
