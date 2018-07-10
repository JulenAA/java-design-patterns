package composite.example3;

public class EmpresaSinFilial extends Empresa {

	@Override
	public double calculaCosteMantenimiento() {
		return nVehiculos * costeunitarioVehiculo;
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		return false;
	}

}
