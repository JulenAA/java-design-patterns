package singleton.example3;

public class Configurador {
	
	private String url;
	private String baseDatos;
	
	//Variable estática privada que almacene una referencia al objeto que vamos a crear a traves del constructor 
	private static Configurador miConfigurador;
	
	//Método estático publico que se encarga de instanciar el objeto la primera vez y almacenarlo en la variable estática
	public static Configurador getConfigurador(String url, String baseDatos){
		if(miConfigurador == null){
			miConfigurador = new Configurador(url, baseDatos);
		}
		return miConfigurador;
	}

	private Configurador(String url, String baseDatos) {
		this.url = url;
		this.baseDatos = baseDatos;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getBaseDatos() {
		return baseDatos;
	}
	
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	
}
