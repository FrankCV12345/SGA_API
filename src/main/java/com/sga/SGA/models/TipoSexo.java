package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table()
public class TipoSexo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idSexo;
	@Column(name="nombreSexo",nullable=false,unique=true,length=40)
	private String nombreSexo;
	@Column(name="Descripcion",nullable=true,length=120)
	private String Descripcion;
	
	
	public TipoSexo() {
		super();
	}
	public TipoSexo(String nombreSexo, String descripcion) {
		super();
		this.nombreSexo = nombreSexo;
		Descripcion = descripcion;
	}
	public String getNombreSexo() {
		return nombreSexo;
	}
	public void setNombreSexo(String nombreSexo) {
		this.nombreSexo = nombreSexo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public long getIdSexo() {
		return idSexo;
	}
	
	
}
