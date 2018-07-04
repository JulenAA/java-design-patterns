package observer.example3;

import observer.example3.version1.Libro;

public class Biblioteca {
	
	public void devuelveLibro(Libro libro){
		if(libro.getEstado().equals("MALO")){
			AlarmaLibro a = new AlarmaLibro();
			a.addObserver(new Administracion());
			a.addObserver(new Compras());
			a.addObserver(new Stock());
			a.disparaAlarma(libro);
		}
	}
}
