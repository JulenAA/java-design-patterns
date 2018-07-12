package iterator.example3;

public class Empleado {
	
	private String nombre;
	private String division;
	
	public Empleado(String nombre, String division) {
		this.nombre = nombre;
		this.division = division;
	}
	
	public String getName() {
		return nombre;
	}

	public void print(){
		System.out.println("Nombre: " + nombre + " División: " + division);
	}
}
