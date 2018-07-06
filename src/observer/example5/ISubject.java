package observer.example5;

//Interfaz que expone los metodos de registro y eliminacion de observers, asi como para
//la notificacion de los cambios de estado.
public interface ISubject {
	
	void registraObserver(IObserver o);
	void eliminaObserver(IObserver o);
	void notificarObservers();
}
