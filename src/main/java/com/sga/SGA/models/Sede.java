package com.sga.SGA.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.Id;
@Entity
@Table(name="sedeInstituto")
public class Sede {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="nombreSede",nullable=false,unique=true,length=60)
	@Size(min = 4, max = 60)
	private String nombreSede;
	@Size(min = 10, max = 120)
	@Column(name="direccionSede",nullable=false,length=120)
	private String direccion;
	@Column(name="softDelete",nullable=false)
	private boolean softDelete;
	
	
	
	public Sede() {
		super();
	}
	public Sede(long id, @Size(min = 4, max = 60) String nombreSede, @Size(min = 10, max = 120) String direccion,
			boolean softDelete) {
		super();
		this.id = id;
		this.nombreSede = nombreSede;
		this.direccion = direccion;
		this.softDelete = softDelete;
	}
	public String getNombreSede() {
		return nombreSede;
	}
	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isSoftDelete() {
		return softDelete;
	}
	public void setSoftDelete(boolean softDelete) {
		this.softDelete = softDelete;
	}
	public long getId() {
		return id;
	}
	
	

}
