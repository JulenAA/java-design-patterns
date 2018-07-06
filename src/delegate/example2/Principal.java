package delegate.example2;

public class Principal {
	
	public static void main(String[] args) {
		
		EmpleadoDeTienda empTienda = new EmpleadoDeTienda();
		empTienda.setNombre("Julen");
		System.out.printf("Nombre del empleado: %s%n", empTienda.getNombre());
		empTienda.setSueldo(2000);
		empTienda.cobrar();
		empTienda.setDomicilio("Gran vía, Bilbao");
		escribeDatosCuadro(empTienda);
		sueldoEmpleado(empTienda.getTrabajador());
	}
	
	private static void escribeDatosCuadro(Persona p){
		System.out.println("---------------------------");
		System.out.println(p.getNombre());
		System.out.println(p.getDomicilio());
		System.out.println("---------------------------");
	}
	
	private static void sueldoEmpleado(Trabajador t){
		System.out.println("El sueldo es: " + t.getSueldo());
	}

}
