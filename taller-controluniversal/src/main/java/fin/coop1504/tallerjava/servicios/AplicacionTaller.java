package fin.coop1504.tallerjava.servicios;

import fin.coop1504.tallerjava.entidades.Aireacondicionado;
import fin.coop1504.tallerjava.entidades.ControlUniversal;
import fin.coop1504.tallerjava.entidades.Televisor;
import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class AplicacionTaller {
	public static void main(String[] args) {
		Televisor tvSale = new Televisor("TV-SALA");
		Aireacondicionado aireCuarto = new Aireacondicionado("AIRE-CUARTO");
		ControlUniversal.encenderDispositivo(tvSale);
		ControlUniversal.encenderDispositivo(aireCuarto);
		ControlUniversal.encenderDispositivo(
				new ReferenciaDispositivo() {
					
					public void encender() {
						// TODO Auto-generated method stub
						System.out.println("Encender"+"dispositivo");
					}
					
					public void apagar() {
						// TODO Auto-generated method stub
						System.out.println("Apagar"+"dispositivo");
					}
				});
	}
}
