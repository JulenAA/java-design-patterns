package observer.example5;

public interface IObserver {
	
	// Metodo que sera invocado por el Subject
    // El objeto "o" seran los valores que el Subject le pasara al Obs
	void update(Object o);

}
