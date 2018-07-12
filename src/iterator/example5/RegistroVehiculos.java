package iterator.example5;

import java.util.ArrayList;
import java.util.Date;

public class RegistroVehiculos implements IRegistroVehiculos {
	
	private ArrayList<Vehiculo> listaVehiculos;
	
	public RegistroVehiculos() {
		listaVehiculos = new ArrayList<Vehiculo>();
	}

	@Override
	public void insertarVehiculo(String marca, String modelo, double precio) {
		Vehiculo v = new Vehiculo(marca, modelo, new Date(), precio);
		listaVehiculos.add(v);
	}

	@Override
	public Vehiculo mostrarInformacionVehiculo(int indice) {
		return listaVehiculos.get(indice);
	}

	@Override
	public IIteratorVehiculo ObtenerIterator() {
		return new IteratorVehiculo(listaVehiculos);
	}
	
	

}
