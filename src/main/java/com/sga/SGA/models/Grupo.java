package com.sga.SGA.models;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name="Grupo")
public class Grupo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false)
	private Date  fechaInicio;
	@Column(nullable=false)
	private Date  fechaFin;
	private boolean softdelete;
	
	//claves foraneas
	@ManyToOne
	private Carreras carrera;
	@ManyToOne
	private TurnosCarreras turno;
	@ManyToOne
	private CiclosCarreras ciclo;
	@ManyToOne
	private modalida modalidad;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public boolean isSoftdelete() {
		return softdelete;
	}


	public void setSoftdelete(boolean softdelete) {
		this.softdelete = softdelete;
	}


	public Carreras getCarrera() {
		return carrera;
	}


	public void setCarrera(Carreras carrera) {
		this.carrera = carrera;
	}


	public TurnosCarreras getTurno() {
		return turno;
	}


	public void setTurno(TurnosCarreras turno) {
		this.turno = turno;
	}


	public CiclosCarreras getCiclo() {
		return ciclo;
	}


	public void setCiclo(CiclosCarreras ciclo) {
		this.ciclo = ciclo;
	}


	public modalida getModalidad() {
		return modalidad;
	}


	public void setModalidad(modalida modalidad) {
		this.modalidad = modalidad;
	}


	public Grupo() {
		super();
	}


	public Grupo(long id) {
		super();
		this.id = id;
	}	
	
	
	
	

}
