package pr05;

import java.util.Random;

public class Dado {
	Marcador marcador;

	public Dado(Marcador marcador) {

		this.marcador = marcador;
	}

	public void newThrow() {

		marcador.aumentar(new Random().nextInt(6));

	}

}
