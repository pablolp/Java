package ejerciciosSentencias;

public class PrimerosImapares {

	public void miMain(){
		for(int i=0; i<=10;i++){
			if (ParImpar.esImpar(i)){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimerosImapares programa = new PrimerosImapares();
		programa.miMain();
	}

}
