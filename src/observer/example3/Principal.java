package observer.example3;

import observer.example3.version1.Libro;

public class Principal {

	public static void main(String[] args) {
		Libro libro = new Libro();
		libro.setTitulo("Windows es estable");
		libro.setEstado("MALO");
		
		Biblioteca b = new Biblioteca();
		b.devuelveLibro(libro);
	}

}
