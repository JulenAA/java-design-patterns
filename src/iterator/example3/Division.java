package iterator.example3;

public class Division {
	
	private Empleado[] empleados = new Empleado[100];
	private int numero = 0;
	private String nombreDivision;
	
	
	public Division(String nombreDivision) {
		this.nombreDivision = nombreDivision;
	}
	
	public String getName() {
		return nombreDivision;
	}
	
	public void add(String nombre){
		Empleado e = new Empleado(nombre, nombreDivision);
		empleados[numero++] = e;
	}
	
	public DivisionIterator iterator(){
		return new DivisionIterator(empleados);
	}

}
