package delegate.example5;

public class Coche {
	
	private String marca;
	private Motor motor;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getPotencia() {
		return motor.getPotencia();
	}

	public void setPotencia(int potencia) {
		motor.setPotencia(potencia);
	}

	public int getCilindros() {
		return motor.getCilindros();
	}

	public void setCilindros(int cilindros) {
		motor.setCilindros(cilindros);
	}
	
	

}
