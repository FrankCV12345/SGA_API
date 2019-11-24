package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbCarrera")
public class Carreras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,length=30)
	private String nombre;
	@Column(nullable=false,length=300)
	private String descripion;
	@Column(nullable=false)
	private double prension;
	@Column(nullable=false)
	private double matricula;	
	private boolean softDelete;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripion() {
		return descripion;
	}
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
	public double getPrension() {
		return prension;
	}
	public void setPrension(double prension) {
		this.prension = prension;
	}
	public double getMatricula() {
		return matricula;
	}
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
	public Carreras() {
		super();
	}
	public Carreras(long id) {
		super();
		this.id = id;
	}
	
	
	
	
	
}
