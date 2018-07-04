package observer.example3;

import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		System.out.println("Compras:");
		System.out.println("Solicitio nueva cotización...");		
	}

}
