package ejercicio4;

import java.util.Scanner;

public class Porra {
	final int APUESTA_MAX = 3;
	Scanner teclado;
	Jugador jugadores[];

	public Porra() {
		jugadores = new Jugador[2];
		teclado = new Scanner(System.in);
	}
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	public static void main(String[] args) {
		Porra porra = new Porra();
		porra.crearJugadores();
		porra.guardarCantidades();
		porra.hacerApuesta();
		porra.comprobar();
	}

	private void comprobar() {
		int total=0;
		total += jugadores[0].getCantidad();
		total += jugadores[1].getCantidad();
		
		if(jugadores[0].getApuesta() == jugadores[1].getApuesta())
			System.out.println("Los jugares han hecho la misma apuesta");
		else if(jugadores[0].getApuesta()== total){
			System.out.println("El Jguador 1 a Acertado con "+jugadores[0].getApuesta());
		}
		else if(jugadores[0].getApuesta()== total){
			System.out.println("El Jguador 2 a Acertado con "+jugadores[1].getApuesta());
		}
		else
			System.out.println("Ninguno a acertado jugador 1 tenia "+jugadores[0].getCantidad()+" Y el jguador 2 tenia "+jugadores[1].getCantidad());
			
		
	}
	private void hacerApuesta() {
		jugadores[0].hacerApuesta();
		
		jugadores[1].hacerApuesta();
		
		
	}
	private void guardarCantidades() {
		jugadores[0].guardarCantidad();
		clearConsole();
		jugadores[1].guardarCantidad();
		clearConsole();
		
	}
	private void crearJugadores() {
		int opcion;
		System.out.println("Elige una opcion");
		System.out.println("1-> Humano vs Humano");
		System.out.println("2-> Humano vs Maquina");
		System.out.println("3-> Maquina vs Maquina");
		opcion = teclado.nextInt();
		switch (opcion) {
		case 1:			
			jugadores[0] = new Humano(APUESTA_MAX);
			jugadores[1]= new Humano(APUESTA_MAX);
			break;
		case 2:
			jugadores[0] = new Humano(APUESTA_MAX);
			jugadores[1]= new Maquina(APUESTA_MAX);
			break;
		case 3:
			jugadores[0] = new Maquina(APUESTA_MAX);
			jugadores[1]= new Maquina(APUESTA_MAX);
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
}
