package observer.example3;

import java.util.Observable;
import java.util.Observer;

public class Administracion implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		System.out.println("Administración:");
		System.out.println("Envio una queja formal...");
	}

}
