package observer.example3.version1;


public class Principal {
	
	public static void main(String[] args) {
		AlarmaLibro a = new AlarmaLibro();
		a.attach(new Administracion());
		a.attach(new Compras());
		a.attach(new Stock());
		
		Libro libro = new Libro();
		libro.setEstado("MALO");
		
		Biblioteca b = new Biblioteca();
		b.devuelveLibro(libro);
	}

}
