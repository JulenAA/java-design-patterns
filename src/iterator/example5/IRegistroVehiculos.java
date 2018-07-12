package iterator.example5;

public interface IRegistroVehiculos {
	
	void insertarVehiculo(String marca, String modelo, double precio);
	Vehiculo mostrarInformacionVehiculo(int indice);
	IIteratorVehiculo ObtenerIterator();
	
}
