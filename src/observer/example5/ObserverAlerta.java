package observer.example5;

public class ObserverAlerta implements IObserver {

	// Niveles minimos y maximos
	private static final int MIN_ACEITE = 12;
	private static final int MAX_ACEITE = 45;

	private static final int MIN_AGUA = 300;
	private static final int MAX_AGUA = 550;

	private static final int MIN_PRESION = 120;
	private static final int MAX_PRESION = 350;

	// Atributos que modelan el estado
	private int nivelAceite;
	private int nivelAgua;
	private int nivelPresionNeumaticos;

	// Subject al que se encuentra suscrito el observer
	@SuppressWarnings("unused")
	private ISubject subject;
	
	// El constructor suscribira el observer al subject
	public ObserverAlerta(ISubject subject) {
		this.subject = subject;
		subject.registraObserver(this);
	}

	@Override
	public void update(Object o) {
		// Comprobamos el tipo del objeto recibido como parametro
        int[] arrayInt = null;
        if (o instanceof int[])
            arrayInt = (int[])o;
 
        // Si es del tipo esperado (int[]) y del tamano esperado (3), actualizamos los
        // atributos
        if ((arrayInt != null) && (arrayInt.length == 3))
        {
            nivelAceite = arrayInt[0];
            nivelAgua = arrayInt[1];
            nivelPresionNeumaticos = arrayInt[2];
 
            // Comprobamos que los valores no exceden los limites
            comprobarAceite();
            comprobarAgua();
            comprobarNeumaticos();
        }

	}	

	private void comprobarAceite() {
		if(nivelAceite < MIN_ACEITE){
			enviarAlerta();
			System.out.printf("NIVEL DE ACEITE DEMASIADO BAJO: %d/%d%n", nivelAceite, MIN_ACEITE);
		}
		if(nivelAceite > MAX_ACEITE){
			enviarAlerta();
			System.out.printf("NIVEL DE ACEITE DEMASIADO ALTO: %d/%d%n", nivelAceite, MAX_ACEITE);
		}
	}
	
	private void comprobarAgua() {
		if(nivelAgua < MIN_AGUA){
			enviarAlerta();
			System.out.printf("NIVEL DE AGUA DEMASIADO BAJO: %d/%d%n", nivelAgua, MIN_AGUA);
		}
		if(nivelAgua > MAX_AGUA){
			enviarAlerta();
			System.out.printf("NIVEL DE AGUA DEMASIADO ALTO: %d/%d%n", nivelAgua, MAX_AGUA);
		}
	}
	
	private void comprobarNeumaticos() {
		if(nivelPresionNeumaticos < MIN_PRESION){
			enviarAlerta();
			System.out.printf("NIVEL DE PRESIÓN DE NEUMÁTICOS DEMASIADO BAJO: %d/%d%n", nivelPresionNeumaticos, MIN_PRESION);
		}
		if(nivelPresionNeumaticos > MAX_PRESION){
			enviarAlerta();
			System.out.printf("NIVEL DE PRESIÓN DE NEUMÁTICOS DEMASIADO ALTO: %d/%d%n", nivelPresionNeumaticos, MAX_PRESION);
		}
	}

	// Metodo que envie la alerta
	private void enviarAlerta() {
		// Este metodo podria enviar una alerta a la centralita del vehiculo que, por ejemplo,
        // forzaria a su detencion
		System.out.println("ALERTA");
	}

}
