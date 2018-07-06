package delegate.example1;

public class Organiza {

	/**
	 * Metodo para calcular el mayor de entre 2 numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double calculaMayor(double a, double b) {
		if (a > b)
			return a;
		else
			return b;
	}

	/**
	 * Metodo para calcular el menor de entre 2 numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double calculaMenor(double a, double b) {
		if (a < b)
			return a;
		else
			return b;
	}

}
