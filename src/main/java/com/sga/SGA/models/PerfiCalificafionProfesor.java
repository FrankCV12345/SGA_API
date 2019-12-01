package com.sga.SGA.models;

import java.util.List;
import java.util.ArrayList;;

public class PerfiCalificafionProfesor {
	private String nombreProfesor;
	private String apellidosProfesor;
	private int promedioAclaraDudas;
	private int primedioExpresaClaramente;
	private int dominaTema;
	private int cantidadCalificaciones;
	private List<String> comentarios = new ArrayList<>() ;
	private List<CalificacionAlumnoProfesor> listacalificaciones;
	
	
	
	public PerfiCalificafionProfesor(List<CalificacionAlumnoProfesor> listacalificaciones) {
		super();
		this.listacalificaciones = listacalificaciones;
		int acumuladosPromediAclaraDudas = 0;
		int acumuladosPromedioExpresaClaramente = 0 ;
		int acumuladosPrimedioDominaTema = 0 ;
		for(int  i =0 ; i< listacalificaciones.size() ; i ++) {
			CalificacionAlumnoProfesor calificacion = listacalificaciones.get(i);
			acumuladosPrimedioDominaTema += calificacion.getDominatema();
			acumuladosPromedioExpresaClaramente +=  calificacion.getExpresaclaramente();
			acumuladosPromediAclaraDudas += calificacion.getAclaradudas();
			this.apellidosProfesor=calificacion.getProfesorcalificado().getApellidos();
			this.nombreProfesor =calificacion.getProfesorcalificado().getNombre();
			comentarios.add(calificacion.getComentario());
			this.cantidadCalificaciones += 1;
		}
		this.promedioAclaraDudas = acumuladosPromediAclaraDudas/listacalificaciones.size();
		this.primedioExpresaClaramente = acumuladosPromedioExpresaClaramente/listacalificaciones.size();
		this.dominaTema = acumuladosPrimedioDominaTema/listacalificaciones.size();
		
		
	}
	public int getPromedioAclaraDudas() {
		return promedioAclaraDudas;
	}
	public void setPromedioAclaraDudas(int promedioAclaraDudas) {
		this.promedioAclaraDudas = promedioAclaraDudas;
	}
	public int getPrimedioExpresaClaramente() {
		return primedioExpresaClaramente;
	}
	public void setPrimedioExpresaClaramente(int primedioExpresaClaramente) {
		this.primedioExpresaClaramente = primedioExpresaClaramente;
	}
	public int getDominaTema() {
		return dominaTema;
	}
	public void setDominaTema(int dominaTema) {
		this.dominaTema = dominaTema;
	}
	public List<String> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}
	public List<CalificacionAlumnoProfesor> getListacalificaciones() {
		return listacalificaciones;
	}
	public void setListacalificaciones(List<CalificacionAlumnoProfesor> listacalificaciones) {
		this.listacalificaciones = listacalificaciones;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public String getApellidosProfesor() {
		return apellidosProfesor;
	}
	public void setApellidosProfesor(String apellidosProfesor) {
		apellidosProfesor = apellidosProfesor;
	}
	public int getCantidadCalificaciones() {
		return cantidadCalificaciones;
	}
	public void setCantidadCalificaciones(int cantidadCalificaciones) {
		this.cantidadCalificaciones = cantidadCalificaciones;
	}
	
	
	
	
}
