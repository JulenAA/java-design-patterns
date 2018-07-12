package iterator.example2;

import java.util.Vector;

public class AgregadoConcreto implements Agregado {
	
	protected Vector<String> aDatos = new Vector<String>();
	
	public AgregadoConcreto() {
		llenar();
	}

	private void llenar() {
        this.aDatos.add( new String("JOSE") );
        this.aDatos.add( new String("MARTA") );
        this.aDatos.add( new String("ANTONIO") );
        this.aDatos.add( new String("ROMINA") );
	}

	@Override
	public Iterador getIterador() {
		return new IteradorConcreto(this);
	}

}
