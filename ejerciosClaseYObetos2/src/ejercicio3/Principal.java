package ejercicio3;

import java.util.Scanner;

public class Principal {
	final int MAX_CIRCLE = 3;
	Bala bala;
	int numeroDisparos,numCirculo;
	Circulo circulo[];
	Scanner teclado = new Scanner (System.in);
		public Principal() {
		circulo= new Circulo[3];
	}
	public int menu(){		
		System.out.println("1-> Crear Circulo");
		if(numCirculo>=3)
			System.out.println("(No se pueden crar mas circulos)");
		System.out.print("2-> Disparar");
		if(numCirculo<3)
			System.out.println("(primero crea los circulos)");
		System.out.println("3-> Reiniciar");
		System.out.println("0-> Salir");
		return teclado.nextInt();		
	}
	public void nuevoCirculo(){
		int x,y,radio;
		System.out.println("Cuales son las coordenadas x , y?");
		System.out.print("x=>");
		x=teclado.nextInt();
		System.out.print("y=>");
		y=teclado.nextInt();
		System.out.println("Cual es el radio?");
		radio = teclado.nextInt();
		circulo[numCirculo++] = new Circulo(x,y,radio);
	}
	public void disparar(){
		int x=0,y=0,angulo;
		double vx,vy;
		for (int i = 0; i < circulo.length; i++) {
			do{
			System.out.println("Cuales es el angulo con el que quieres disparar)");
			angulo = teclado.nextInt();
			vx=Math.cos((angulo*2*3.1415)/360);
			vy=Math.sin((angulo*2*3.1415)/360);
			x+=vx;
			y+=vy;
			if(circulo[i].colisiona(x, y)){
				System.out.println("has colisionado con el circulo "+i+" en las cordenas("+circulo[i].getCx()+","+circulo[i].getCy()+") en las coordenadas ("+x+","+y+")");
				break;
			}
			if(x<-100 || x>100 || y<-100 || y>100)
				System.out.println("has fallado");
			 	break;
			}while(true);
			
		}
		
		
	}
	public static void main(String[] args) {
		Principal programa = new Principal();
		boolean salir = false;
		do{
			switch (programa.menu()) {
			case 0:	
				salir = true;
				break;
			case 1:	
				programa.nuevoCirculo();
				break;
			case 2:		
				programa.disparar();
				break;
	
			default:
				break;
			}
		}while(!salir);
	}

}
