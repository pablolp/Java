package ejercicio1;

public class HorasPrecisas extends Hora{
	int segundos;
	public HorasPrecisas(int h, int m,int s) {	
		super(h, m);
		segundos = s;
	}
	@Override
	public int comparar(Hora b) {
		// TODO Auto-generated method stub
		int ret;
		if((ret=super.comparar(b))==0){
			if(!(b instanceof HorasPrecisas))
				if (segundos == 0)
					return 0;
				else
					return -1;
			else if(segundos <((HorasPrecisas)b).segundos)
				ret = 1;
			else if( segundos >((HorasPrecisas)b).segundos)
				ret = -1;
			else
				ret = 0;
		}
		return ret;			
	}
	@Override
	public String toString() {
		return "HorasPrecisas [hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}
	
	
}
