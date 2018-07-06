package delegate.example2;

public class EmpleadoDeTienda extends Persona {
	
	private Trabajador trabajador;

	public EmpleadoDeTienda() {
		trabajador = new Trabajador();
	}
	
	public Trabajador getTrabajador() {
		return trabajador;
	}
	
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
	public float getSueldo(){
		return trabajador.getSueldo();
	}
	
	public void setSueldo(float sueldo){
		trabajador.setSueldo(sueldo);
	}
	
	public void cobrar(){
		trabajador.cobrar();
	}
}
