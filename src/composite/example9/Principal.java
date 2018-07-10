package composite.example9;

public class Principal {

	public static void main(String[] args) {
		
		Fichero f1 = new FicheroSimple("fichero1.txt");
		Fichero f2 = new FicheroSimple("fichero2.txt");
		
		Directorio d1 = new Directorio("micarpeta");
		
		d1.addFichero(f1);
		d1.addFichero(f2);
		
		Directorio d2 = new Directorio("supercarpeta");
		d2.addFichero(new FicheroSimple("fichero3.txt"));
		
		d2.addFichero(d1);
		recorrerFicheros(d2);

	}

	private static void recorrerFicheros(Fichero fichero) {
		System.out.println(fichero.getNombre());
		if(fichero.esDirectorio()){
			for (Fichero f : fichero.getFicheros()) {
				recorrerFicheros(f);
			}
		}
	}

}
