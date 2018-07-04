package observer.example3.version1;


public interface Subject {
	
	public void attach(ILibroMalEstado observador);
	public void dettach(ILibroMalEstado observador);
	public void notifyObservers();
}
