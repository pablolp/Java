package ejercicio3;

public class Lavadora extends Electrodomestico {

	@Override
	public String toString() {
		return "La Lavadora esta " + ((estado)? "encendida":"apagada") + ".";
	}

}
