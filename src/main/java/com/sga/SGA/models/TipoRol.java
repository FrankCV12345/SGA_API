package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Rol")
public class TipoRol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="nombrerol",nullable=false,unique=true,length=40)
	private String nombreRol;
	@Column(name="descripcion",nullable=true,length=120)
	private String descripcion;
    @Column(name="nivelDeAcceso",nullable=false)
	private int nivelAcceso;
    
    
    
	public TipoRol() {
		super();
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombreRol() {
		return nombreRol;
	}



	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getNivelAcceso() {
		return nivelAcceso;
	}



	public void setNivelAcceso(int nivelAcceso) {
		this.nivelAcceso = nivelAcceso;
	}
	
	
    
    
}
