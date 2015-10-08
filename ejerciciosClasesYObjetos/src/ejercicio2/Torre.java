package ejercicio2;

import java.util.Scanner;

public class Torre {
	private int x,y;
	static Scanner teclado = new Scanner(System.in);
	public Torre(int x,int y){
		this.x=x;
		this.y=y;
	}
	public boolean mover (int x,int y){
		if (this.x==x || this.y == y){
			this.x=x;
			this.y=y;
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		return "La torre esta en la posición("+x+" , "+y+")";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Torre torre = new Torre(0,0);
		int newX,newY;
		do{
			System.out.println(torre+"\n"+"a donde la quiere mover?");
			System.out.print("x =");
			newX = teclado.nextInt();
			System.out.print("y =");
			newY = teclado.nextInt();
			teclado.nextLine();
			if(!torre.mover(newX, newY)){
				System.out.println("La torre solo se puede mover en una dirección");
			}
			System.out.println(torre);
			System.out.println("quiere seguir moviendo? (S/N)");
		}while(teclado.nextLine().toUpperCase().equals("S"));
	}
}

