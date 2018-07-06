package delegate.example3;

public class DelegatePattern {
	
	public static void main(String[] args) {
		System.out.println("Usando el SuperAutomovil");
		SuperAutoMovil superAutoMovil = new SuperAutoMovil();
		System.out.println("-- Funciones de Automovil --");
		superAutoMovil.iniciarMotor();
		superAutoMovil.andar();
		
		System.out.println();
		System.out.println("-- Funciones de Sumergible --");
		superAutoMovil.navegar();
		superAutoMovil.navegarMasProfundo();
		superAutoMovil.navegarMasSuperficial();
		
		System.out.println();
		System.out.println("-- Funciones de Helicoptero --");
		superAutoMovil.volar();
		superAutoMovil.volarMasAlto();
		superAutoMovil.volarMasBajo();
	}

}

class Barco{
	public void iniciarMotor(){
		System.out.println("Barco: iniciando motor");
	}
	
	public void andar(){
		System.out.println("Barco: andando");
	}
}

class Automovil{
	public void iniciarMotor(){
        System.out.println("Automovil: iniciando motor");
    }
	
    public void andar(){
        System.out.println("Automovil: andando");
    }
}

class Helicoptero{
	public void iniciarMotor(){
        System.out.println("Helicoptero: iniciando motor");
    }
    
	public void andar(){
        System.out.println("Helicoptero: andando");
    }
    
	public void descender(){
        System.out.println("Helicoptero: descendiendo");
    }  
    
	public void ascender(){
        System.out.println("Helicoptero: ascendiendo");
    }
}

class Sumergible extends Barco{
	public void descender(){
        System.out.println("Sumergible: descendiendo");
    }  
    public void ascender(){
        System.out.println("Sumergible: ascendiendo");
    }
}

class SuperAutoMovil extends Automovil{
	private Sumergible sumergible;
	private Helicoptero helicoptero;
	
	public SuperAutoMovil() {
		sumergible = new Sumergible();
		helicoptero = new Helicoptero();
	}
	
	@Override
	public void andar() {
		super.iniciarMotor();
		super.andar();
	}
	
	public void navegar(){
		sumergible.iniciarMotor();
		sumergible.andar();
	}
	
	public void volar(){
		helicoptero.iniciarMotor();
		helicoptero.andar();
	}
	
	public void volarMasAlto(){
		helicoptero.ascender();
	}
	
	public void volarMasBajo(){
		helicoptero.descender();
	}
	
	public void navegarMasSuperficial(){
		sumergible.ascender();
	}
	
	public void navegarMasProfundo(){
		sumergible.descender();
	}
}
