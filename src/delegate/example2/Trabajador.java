package delegate.example2;

public class Trabajador {
	
	private float sueldo;
	
	public float getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public void cobrar(){
		System.out.println("He cobrado de sueldo " + this.sueldo);
	}

}
