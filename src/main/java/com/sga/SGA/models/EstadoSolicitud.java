package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbestadosolcitud")
public class EstadoSolicitud {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="nombresolicitud",nullable=false,length=80,unique=true)
	private String nombresolicitud;
	@Column(name="descripcion",nullable=false,length=200)
	private String descripcion;
	@Column(name="softdelete",nullable=false)
	private boolean softdelete;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombresolicitud() {
		return nombresolicitud;
	}
	public void setNombresolicitud(String nombresolicitud) {
		this.nombresolicitud = nombresolicitud;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isSoftdelete() {
		return softdelete;
	}
	public void setSoftdelete(boolean softdelete) {
		this.softdelete = softdelete;
	}
	public EstadoSolicitud(long id, String nombresolicitud, String descripcion, boolean softdelete) {
		super();
		this.id = id;
		this.nombresolicitud = nombresolicitud;
		this.descripcion = descripcion;
		this.softdelete = softdelete;
	}
	public EstadoSolicitud() {
		super();
	}
	public EstadoSolicitud(long id) {
		super();
		this.id = id;
	}
	
	
	
	
}
