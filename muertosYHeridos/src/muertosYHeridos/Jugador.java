package muertosYHeridos;

public class Jugador {
	int numero;
	Validador v;
	public Jugador(int num,Validador reglas){
		if (v.valido(num))
			numero = num;
		v = reglas;
	}
	public int comprobar(int num){
		int numComprobar,miNumero, muertos=0,heridos=0;
		if(v.valido(num)){
			for (int i = 0; i < 4; i++) {
				numComprobar = sacarNumero(num,i);
				for (int j=0;j<4;j++){
					miNumero = sacarNumero(this.numero,i);
					if ( numComprobar == miNumero){
						if(i==j){
							muertos++;
						}else{
							heridos++;
						}
					}
				}
			}
			System.out.println(muertos+" Muertos y "+heridos+"heridos.");
			if (heridos !=0 || muertos !=0)	return 1;
			else return 0;
		}
		else return -1;
		
	}
	public static int sacarNumero(int num,int pos){
		int ret;
		ret = (int)(num%(Math.pow(10, pos+1)));
		ret/= Math.pow(10, pos);
		return ret;
	}
}
