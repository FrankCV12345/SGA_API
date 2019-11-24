package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbCiclosCarreras")
public class CiclosCarreras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false)
	private int nrociclo;
	@ManyToOne
	private Carreras carrera;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNrociclo() {
		return nrociclo;
	}
	public void setNrociclo(int nrociclo) {
		this.nrociclo = nrociclo;
	}
	public Carreras getCarrera() {
		return carrera;
	}
	public void setCarrera(Carreras carrera) {
		this.carrera = carrera;
	}
	public CiclosCarreras(long id) {
		super();
		this.id = id;
	}
	public CiclosCarreras() {
		super();
	}
	
	
	
	
}
