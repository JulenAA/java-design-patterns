package composite.example8;

import java.util.ArrayList;

public class Recambio extends ComponenteRecambio {
	
	// Arraylist que contendrá los elementos hijo
	private ArrayList<ComponenteRecambio> listaRecambios;
	
	// Atributos
	private String nombre;
	private String descripcion;
	private double precio;
	
	// Constructor que recibirá el nombre, el precio y la descripción.
	public Recambio(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		
		listaRecambios = new ArrayList<ComponenteRecambio>();
	}
	
	// Añade un nuevo elemento al ArrayList
	@Override
	public void add(ComponenteRecambio componente) {		
		listaRecambios.add(componente);
	}
	
	// Elimina un elemento del ArrayList
	@Override
	public void remove(ComponenteRecambio componente) {
		listaRecambios.remove(componente);
	}
	
	// Recupera un elemento del ArrayList
	@Override
	public ComponenteRecambio getElemento(int indice) {
		return listaRecambios.get(indice);
	}
	
	@Override
	public String getNombre() {
		String nombreCompleto = this.nombre + "\n";
		for (ComponenteRecambio c : listaRecambios) {
			nombreCompleto += c.getNombre() + "\n";
		}
		return nombreCompleto;
	}
	
	@Override
	public String getDescripcion() {
		String descripcionCompleta = this.descripcion + "\n";
		for (ComponenteRecambio c : listaRecambios) {
			descripcionCompleta += c.getDescripcion();
		}
		return descripcionCompleta;
	}
	
	@Override
	public double getPrecio() {
		double precioTotal = this.precio;
		for (ComponenteRecambio c : listaRecambios) {
			precioTotal += c.getPrecio();
		}
		return precioTotal;
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
