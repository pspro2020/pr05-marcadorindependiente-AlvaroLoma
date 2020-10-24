package pr05;

public class Main {

	public static void main(String[] args) {
		int numero=0;
		Marcador marcador= new Marcador();
		Dado dado= new Dado(marcador);
		Thread[] hilos= new Thread[3];
		for (int i = 0; i < hilos.length; i++) {
			hilos[i] = new Thread(new Tarea(dado));
		}
		for (int i = 0; i < hilos.length; i++) {
			hilos[i].start();
		}
		for (int i = 0; i < hilos.length; i++) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("El numero "+(i+1)+", ha salido: "+marcador.getPuntuaciones(i));
			numero+=marcador.getPuntuaciones(i);
		}
		System.out.println("En total se ha tirado el dado: "+numero+" veces");

	}

}
