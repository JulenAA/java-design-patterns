package iterator.example3;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Division d = new Division("Mi Sucursal");
		d.add("Empleado 1");
		d.add("Empleado 2");
		
		Iterator<Empleado> iter = d.iterator();
		while (iter.hasNext()) {
			Empleado empleado = (Empleado) iter.next();
			empleado.print();
		}
	}

}
