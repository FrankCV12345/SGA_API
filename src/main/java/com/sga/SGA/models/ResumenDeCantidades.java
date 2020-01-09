package com.sga.SGA.models;

public class ResumenDeCantidades {
	private Integer cantidad_profesores_calificados;
	private Integer Cantidad_profesores;
	private Integer cantidaMatriculados;
	private Integer cantidad_Secciones;
	
	
	
	public ResumenDeCantidades(Integer cantidad_profesores_calificados, Integer cantidad_profesores,
			Integer cantidaMatriculados, Integer cantidad_Secciones) {
		super();
		this.cantidad_profesores_calificados = cantidad_profesores_calificados;
		Cantidad_profesores = cantidad_profesores;
		this.cantidaMatriculados = cantidaMatriculados;
		this.cantidad_Secciones = cantidad_Secciones;
	}
	
	public ResumenDeCantidades() {
		super();
	}

	public Integer getCantidad_profesores_calificados() {
		return cantidad_profesores_calificados;
	}
	public void setCantidad_profesores_calificados(Integer cantidad_profesores_calificados) {
		this.cantidad_profesores_calificados = cantidad_profesores_calificados;
	}
	public Integer getCantidad_profesores() {
		return Cantidad_profesores;
	}
	public void setCantidad_profesores(Integer cantidad_profesores) {
		Cantidad_profesores = cantidad_profesores;
	}
	public Integer getCantidaMatriculados() {
		return cantidaMatriculados;
	}
	public void setCantidaMatriculados(Integer cantidaMatriculados) {
		this.cantidaMatriculados = cantidaMatriculados;
	}
	public Integer getCantidad_Secciones() {
		return cantidad_Secciones;
	}
	public void setCantidad_Secciones(Integer cantidad_Secciones) {
		this.cantidad_Secciones = cantidad_Secciones;
	}
	
	
	

}
