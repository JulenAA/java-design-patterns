package observer.example3.version1;


public class Biblioteca {
	
	public void devuelveLibro(Libro libro){
		if(libro.getEstado().equals("MALO")){
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObservers();
		}
	}

}
