package iterator.example5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private Date fechaFabricacion;
	private double precio;
	
	public Vehiculo(String marca, String modelo, Date fechaFabricacion,
			double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.precio = precio;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public String caracteristicasVehiculo(){
		return marca + " " + modelo + " fabricado en " + 
				getFechaFormateada(fechaFabricacion) + " con un precio de " + 
				precio + " euros.\n";
	}
	
	private static String getFechaFormateada(Date fecha){
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		return fmt.format(fecha);
	}

}
