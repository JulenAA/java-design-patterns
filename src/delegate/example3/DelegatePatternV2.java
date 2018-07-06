package delegate.example3;

public class DelegatePatternV2 {
	
	public static void main(String[] args) {
		AutomovilV2 automovil = new AutomovilV2();
        automovil.andar();
        automovil.setMotor(new MotorElectrico());
        automovil.andar();
	}
}

interface Motor{
	public void andar();
}

class MotorVapor implements Motor{

	@Override
	public void andar() {
		System.out.println("Aumenta presión");
        System.out.println("Aumenta velocidad");
	}
}

class MotorElectrico implements Motor{
	
	@Override
	public void andar() {
        System.out.println("Aumenta revoluciones");
        System.out.println("Aumenta velocidad");
    }
}

class AutomovilV2{
	private Motor motor = new MotorVapor();
	
	public void andar() {
        motor.andar();
    }
     
    public void setMotor(Motor motorNuevo) {
        motor = motorNuevo;
    }
}
