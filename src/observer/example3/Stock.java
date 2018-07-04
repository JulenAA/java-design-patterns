package observer.example3;

import java.util.Observable;
import java.util.Observer;

public class Stock implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		System.out.println("Stock:");
		System.out.println("Le doy de baja...");
	}

}
