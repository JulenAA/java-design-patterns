package delegate.example5;

public class Principal {
	
	public static void main(String[] args) {
		Coche c = new Coche();
		c.setMarca("Toyota");
		Motor m = new Motor();
		m.setCilindros(6);
		m.setPotencia(100);
		c.setMotor(m);
		
		//1ª version
		System.out.println("Potencia: " + c.getMotor().getPotencia());
		
		//2ª version
		System.out.println("Potencia: " + c.getPotencia());
	}

}
