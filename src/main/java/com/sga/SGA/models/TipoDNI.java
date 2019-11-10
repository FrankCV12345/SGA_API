package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="TipoDoc")
public class TipoDNI {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTipoDoc;
	@Column(name="nombreDoc",nullable=false,unique=true,length=80)
	private String nombreDoc;
	@Column(name="descripcion",nullable=true,length=200)
	private String descripcion;
	
	
	public TipoDNI() {
		super();
	}
	public TipoDNI(String nombreDoc, String descripcion) {
		super();
		this.nombreDoc = nombreDoc;
		this.descripcion = descripcion;
	}
	public long getIdTipoDoc() {
		return idTipoDoc;
	}
	public void setIdTipoDoc(long idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}
	public String getNombreDoc() {
		return nombreDoc;
	}
	public void setNombreDoc(String nombreDoc) {
		this.nombreDoc = nombreDoc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
