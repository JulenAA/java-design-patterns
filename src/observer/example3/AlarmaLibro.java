package observer.example3;

import java.util.Observable;

import observer.example3.version1.Libro;

public class AlarmaLibro extends Observable {

	public void disparaAlarma(Libro libro){
		setChanged();
		notifyObservers("Rompieron el libro: " + libro.getTitulo());
	}
	
}
