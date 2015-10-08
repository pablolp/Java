package ejercicio3;

public class Secadora extends Electrodomestico {

	@Override
	public String toString() {
		return "La Secadora esta " + ((estado)? "encendida":"apagada") + ".";
	}

}
