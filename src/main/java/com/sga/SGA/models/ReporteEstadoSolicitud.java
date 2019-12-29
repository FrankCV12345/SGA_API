package com.sga.SGA.models;

public class ReporteEstadoSolicitud {
	private String TipoEstado;
	private Integer Cantidad;
	
	public ReporteEstadoSolicitud(String tipoEstado, Integer cantidad) {
		super();
		TipoEstado = tipoEstado;
		Cantidad = cantidad;
	}
	public String getTipoEstado() {
		return TipoEstado;
	}
	public void setTipoEstado(String tipoEstado) {
		TipoEstado = tipoEstado;
	}
	public Integer getCantidad() {
		return Cantidad;
	}
	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}
	
	
	

}
