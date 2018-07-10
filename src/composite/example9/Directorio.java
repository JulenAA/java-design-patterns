package composite.example9;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Fichero {
	
	private List<Fichero> ficheros = new ArrayList<Fichero>();
	
	public Directorio(String nombre) {
		super(nombre);
	}

	@Override
	public boolean esDirectorio() {
		return true;
	}

	@Override
	public List<Fichero> getFicheros() {
		return ficheros;
	}
	
	public void setFicheros(List<Fichero> ficheros) {
		this.ficheros = ficheros;
	}

	public void addFichero(Fichero f){
		ficheros.add(f);
	}
}
