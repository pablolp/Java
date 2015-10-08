package ejercicio1;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Principal {
	ArrayList<Hora>horas;

	Scanner teclado = new Scanner(System.in);
	public Principal() {
		horas = new ArrayList<Hora>();

	}
	
	public int laMasPequeña(){
		int ret =0;
		for(int i=1;i<horas.size();i++)
			if((horas.get(ret).comparar(horas.get(i)))==-1)
				ret =i;
		return ret;
		
	}
	public static void main(String[] args) {
		Principal principal = new Principal();
		boolean salir=false;;
		do{
			switch(principal.menu()){
				case 1:
					principal.nuevaHora();
					break;				
				case 2:
					principal.nuevaHoraPrecisa();
					break;
				case 3:
					principal.compararHoras();
					break;
				case 0:
					salir = true;
					break;
				default:
					break;
			}
		}while(!salir);
	}
	public void nuevaHoraPrecisa() {
		int h,m,s;
		Hora añadir;
		do{
			System.out.print("Introduzca la hora: hh mm ss");
			h=teclado.nextInt();
			m=teclado.nextInt();
			s=teclado.nextInt();
			añadir = new HorasPrecisas(h,m,s);
			horas.add(añadir);
			teclado.nextLine();
			System.out.println("Serguir introduciendo horas? (S/N)");
		}while("S".compareTo(teclado.nextLine().toUpperCase())==0);		
		System.out.println(horas.get(laMasPequeña()));
		
	}

	public void compararHoras() {
		int opcion,opcion2,resultado,kont = 1;
		ListIterator<Hora> it;
		it = horas.listIterator();
		while(it.hasNext()){
			System.out.println(kont +it.next().toString());
		}
		System.out.print("Que hora quieres comparar?:");
		opcion = teclado.nextInt()-1;
		System.out.print("Con que hora la quieres comparar?:");
		opcion2 = teclado.nextInt()-1;
		resultado=horas.get(opcion).comparar(horas.get(opcion2));
		if(resultado<0)
			System.out.println("La mas grande es "+horas.get(opcion));
		
		else if(resultado>0)
			System.out.println("La mas grande es "+horas.get(opcion2));
		else
			System.out.println("Las horas son iguales");
	}
	
	public  void nuevaHora() {
		int h,m;
		Hora añadir;
		do{
			System.out.print("Introduzca la hora: hh mm");
			h=teclado.nextInt();
			m=teclado.nextInt();
			añadir = new Hora(h,m);
			horas.add(añadir);
			teclado.nextLine();
			System.out.println("Serguir introduciendo horas? (S/N)");
		}while("S".compareTo(teclado.nextLine().toUpperCase())==0);		
		System.out.println(horas.get(laMasPequeña()));
	}
	
	public int menu(){
		System.out.println("1-> Meter horas");
		System.out.println("2-> Meter horas precisas");
		System.out.println("3-> Comparar horas");
		System.out.println("0-> Salir");
		return teclado.nextInt();
	}
}
