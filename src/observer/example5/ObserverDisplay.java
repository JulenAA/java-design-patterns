package observer.example5;


public class ObserverDisplay implements IObserver {

	// Atributos que modelan el estado
	private int nivelAceite;
    private int nivelAgua;
    private int nivelPresionNeumaticos;
    
    // Subject al que se encuentra suscrito el observer
    @SuppressWarnings("unused")
	private ISubject subject;
    
 // El constructor suscribira el observer al subject
    public ObserverDisplay(ISubject subject) {
		this.subject = subject;
		subject.registraObserver(this);
	}
    
	
	@Override
	public void update(Object o) {
		// Comprobamos el tipo del objeto recibido como parametro
		int[] arrayInt = null;
		if(o instanceof int[]){
			arrayInt = (int[])o;
		}
		
		// Si es del tipo esperado (int[]) y del tamano esperado (3), actualizamos los
        // atributos
		if(arrayInt != null && arrayInt.length == 3){
			nivelAceite = arrayInt[0];
			nivelAgua = arrayInt[1];
			nivelPresionNeumaticos = arrayInt[2];
			
			// Mostramos por pantalla los valores actuales
			mostrarValores();
		}
	}

	private void mostrarValores() {
		System.out.println("\nMostrando valores");
		System.out.println("Nivel de Aceite: " + nivelAceite);
		System.out.println("Nivel de Agua: " + nivelAgua);
		System.out.println("Presión de neumáticos: " + nivelPresionNeumaticos + "\n");
	}

}
