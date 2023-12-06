package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Autor {

//Atributos
	private int idAutor;
	private String nombreAutor;
	private String apellidoAutor;
	private String pais;
	private String direccion;
	private String telefono;
	private String correo;
	
//Constructor
	public Autor() {}

//Metodos Getter and Setter
	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getApellidoAutor() {
		return apellidoAutor;
	}

	public void setApellidoAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombreAutor=" + nombreAutor + ", apellidoAutor=" + apellidoAutor
				+ ", pais=" + pais + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
}
