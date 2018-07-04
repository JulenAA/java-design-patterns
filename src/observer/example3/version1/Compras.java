package observer.example3.version1;

public class Compras implements ILibroMalEstado {
	
	@Override
	public void update() {
		System.out.println("Compras:");
		System.out.println("Solicitio nueva cotización...");
	}

}
