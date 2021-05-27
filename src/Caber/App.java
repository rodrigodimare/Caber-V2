package Caber;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Torneo torneo = new Torneo();
		torneo.cargarConcursantes("archivo.in");
        torneo.guardarResultados("archivo.out");
	}

}
