package pr05;

public class Marcador {

	int puntuaciones[] = new int[] { 0, 0, 0, 0, 0, 0 };
	private Object[] vigilante = new Object[] { new Object(), new Object(), new Object(), new Object(), new Object(),
			new Object() };

	public void aumentar(int numero) {
		synchronized (vigilante[numero]) {
			puntuaciones[numero]++;
		}

	}

	public int getPuntuaciones(int numero) {
		return puntuaciones[numero];
	}

}
