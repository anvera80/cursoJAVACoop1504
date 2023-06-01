package fin.coop1504.tallerjava.servicios;

public class AplicacionTaller {

	public static void main(String[] args) {
		/*
		 * Ciclista clicista1 = new Ciclista("Karen", "001"); Ciclista clicista2 = new
		 * Ciclista("jose", "002"); Ciclista clicista3 = new Ciclista("byron", "003");
		 * Ciclista clicista4 = new Ciclista("angie", "004");
		 * System.out.println("Hilo 1"); clicista1.start();
		 * System.out.println("Hilo 2"); clicista2.start();
		 * System.out.println("Hilo 3"); clicista3.start();
		 * System.out.println("Hilo 4"); clicista4.start();
		 * System.out.println("Hilo principal termino");
		 */
		// hilos sin que extienda Thread

		Thread hilo1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Soy el hilo1 angie :" + i);
				}
			}
		});
		Thread hilo2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Soy el hilo 2 angie :" + i);
				}
			}
		});
		hilo1.start();
		hilo2.start();
//hilo1.run();
	}
}
