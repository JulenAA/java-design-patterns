package observer.example5;

public class Principal {
	
	public static void main(String[] args) {
		// Creamos un medidor de sensores
		ISubject sensores = new MedidorSensores(20, 380, 200);
		
		// Creamos dos observers: un display y un emisor de alertas.
		// Se realiza la suscripcion a traves del constructor
		@SuppressWarnings("unused")
		IObserver display = new ObserverDisplay(sensores);
		@SuppressWarnings("unused")
		IObserver alerta = new ObserverAlerta(sensores);
		
		MedidorSensores medidor = (MedidorSensores)sensores;
		medidor.setNivelAceite(medidor.getNivelAceite() + 10);
		medidor.setNivelAceite(medidor.getNivelAceite() + 10);
		medidor.setNivelAgua(medidor.getNivelAgua() + 100);
		medidor.setNivelPresionNeumaticos(medidor.getNivelPresionNeumaticos()-50);
		medidor.setNivelAceite(medidor.getNivelAceite() + 10);
		medidor.setNivelAgua(medidor.getNivelAgua() + 100);
		medidor.setNivelAgua(medidor.getNivelAgua() + 100);
	}

}
