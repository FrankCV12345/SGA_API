package com.sga.SGA.models;

public class ProfesorPromedio {
	private Long id;
	private String NombreApellidos;
	private Double promedio;
	
	public ProfesorPromedio(Long id, String nombreApellidos, Double promedio) {
		super();
		this.id = id;
		NombreApellidos = nombreApellidos;
		this.promedio = promedio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreApellidos() {
		return NombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		NombreApellidos = nombreApellidos;
	}
	public Double getPromedio() {
		return promedio;
	}
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	
	
	
	
	
}
