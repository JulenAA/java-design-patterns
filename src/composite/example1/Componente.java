package composite.example1;

import java.util.ArrayList;

public abstract class Componente {
	
	protected String nombre;
	
	public Componente(String nombre) {
		this.nombre = nombre;
	}
	
	abstract public void agregar(Componente c);
	abstract public void eliminar(Componente c);
	abstract public void mostrar(int profundidad);

}

class Compuesto extends Componente{

	private ArrayList<Componente> hijo = new ArrayList<Componente>();
	
	public Compuesto(String nombre) {
		super(nombre);
	}

	@Override
	public void agregar(Componente componente) {
		hijo.add(componente);
		
	}

	@Override
	public void eliminar(Componente componente) {
		hijo.remove(componente);		
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println(nombre + " nivel: " + profundidad);
		for (int i=0; i<hijo.size(); i++) {
			hijo.get(i).mostrar(profundidad + 1);
		}
	}
}

class Hoja extends Componente{
	
	public Hoja(String nombre) {
		super(nombre);
	}

	@Override
	public void agregar(Componente c) {
		System.out.println("No se puede agregar la hoja.");
	}

	@Override
	public void eliminar(Componente c) {
		System.out.println("No se puede quitar la hoja.");
	}

	@Override
	public void mostrar(int profundidad) {
		System.out.println('-' + "" + nombre);
	}
	
}
