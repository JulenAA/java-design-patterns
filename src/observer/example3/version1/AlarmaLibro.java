package observer.example3.version1;

import java.util.ArrayList;

public class AlarmaLibro implements Subject {
	
	private static ArrayList<ILibroMalEstado> observadores =
			new ArrayList<ILibroMalEstado>();
	
	@Override
	public void attach(ILibroMalEstado observador) {
		observadores.add(observador);
	}
	
	@Override
	public void dettach(ILibroMalEstado observador) {
		observadores.remove(observador);
	}
	
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observadores.size(); i++) {
			observadores.get(i).update();
		}
		
	}

}
