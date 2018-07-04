package observer.example3.version1;


public class Administracion implements ILibroMalEstado {
	
	@Override
	public void update() {
		System.out.println("Administración:");
		System.out.println("Envio una queja formal...");
	}
}
