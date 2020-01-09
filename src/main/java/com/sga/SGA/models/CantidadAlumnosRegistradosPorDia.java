package com.sga.SGA.models;

public class CantidadAlumnosRegistradosPorDia {
	private String fecha ;
	private Integer cantidadMatriculados;
	public CantidadAlumnosRegistradosPorDia(String fecha, Integer cantidadMatriculados) {
		super();
		this.fecha = fecha;
		this.cantidadMatriculados = cantidadMatriculados;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getCantidadMatriculados() {
		return cantidadMatriculados;
	}
	public void setCantidadMatriculados(Integer cantidadMatriculados) {
		this.cantidadMatriculados = cantidadMatriculados;
	}
	

}
