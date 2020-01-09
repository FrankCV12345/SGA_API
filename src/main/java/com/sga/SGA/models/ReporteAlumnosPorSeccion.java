package com.sga.SGA.models;

public class ReporteAlumnosPorSeccion {
	private  Integer idGrupo;
	private String nombreCarrera;
	private String nombreTurno;
	private Integer catidadAlumnos;
	
	
	
	
	
	public ReporteAlumnosPorSeccion(Integer idGrupo, String nombreCarrera, String nombreTurno, Integer catidadAlumnos) {
		super();
		this.idGrupo = idGrupo;
		this.nombreCarrera = nombreCarrera;
		this.nombreTurno = nombreTurno;
		this.catidadAlumnos = catidadAlumnos;
	}
	
	public Integer getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getNombreTurno() {
		return nombreTurno;
	}
	public void setNombreTurno(String nombreTurno) {
		this.nombreTurno = nombreTurno;
	}
	public Integer getCatidadAlumnos() {
		return catidadAlumnos;
	}
	public void setCatidadAlumnos(Integer catidadAlumnos) {
		this.catidadAlumnos = catidadAlumnos;
	}
	
	
	
}
