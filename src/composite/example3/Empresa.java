package composite.example3;

public abstract class Empresa {
	
	protected static double costeunitarioVehiculo = 5.0;
	protected int nVehiculos;
	
	public void agregaVehiculo(){
		nVehiculos = nVehiculos + 1;
	}
	
	public abstract double calculaCosteMantenimiento();
	
	public abstract boolean agregaFilial(Empresa filial);

}
