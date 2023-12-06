package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetalleFactura {

//Atributos
	private int idDetalleFcatura;
	private int cantidad;
	private double subtotal;
	@Autowired
	private Factura factura;
	@Autowired
	private Libro libro;
	
//Contructor
	public DetalleFactura() {}

//Metodos-Getter and Setter
	public int getIdDetalleFcatura() {
		return idDetalleFcatura;
	}

	public void setIdDetalleFcatura(int idDetalleFcatura) {
		this.idDetalleFcatura = idDetalleFcatura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "DetalleFactura [idDetalleFcatura=" + idDetalleFcatura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
}
