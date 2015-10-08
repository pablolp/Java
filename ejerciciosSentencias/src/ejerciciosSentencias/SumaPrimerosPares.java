package ejerciciosSentencias;

public class SumaPrimerosPares {
	public void miMain(){
		int suma=0;
		for (int i = 1;i<11;i++){
			if (!ParImpar.esImpar(i)){
				suma+=i;
			}
		}
		System.out.println(suma);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaPrimerosPares programa = new SumaPrimerosPares();
		programa.miMain();
	}

}
