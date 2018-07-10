package composite.example9;

import java.util.List;

public abstract class Fichero {
	
	private String nombre;
	
	public Fichero(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract boolean esDirectorio();
	
	public abstract List<Fichero> getFicheros();
}
