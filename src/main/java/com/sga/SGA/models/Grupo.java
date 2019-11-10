package com.sga.SGA.models;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.Id;

@Entity
@Table(name="Grupo")
public class Grupo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Size(min = 3, max = 40)
	@Column(nullable=false,length=40)
	private String modalidad;
	@Column(nullable=false)
	private Date  fechaInicio;
	@Column(nullable=false)
	private Date  fechaFin;
	//claves foraneas
	@Column(nullable=false)
	private long idCarrera;
	@Column(nullable=false)
	private long idTurno;
	@Column(nullable=false)
	private long idCiclo;
	
	
	public Grupo() {
		super();
	}
	public Grupo(long id, @Size(min = 3, max = 40) String modalidad, Date fechaInicio, Date fechaFin, long idCarrera,
			long idTurno, long idCiclo) {
		super();
		this.id = id;
		this.modalidad = modalidad;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.idCarrera = idCarrera;
		this.idTurno = idTurno;
		this.idCiclo = idCiclo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
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
	public long getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(long idCarrera) {
		this.idCarrera = idCarrera;
	}
	public long getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(long idTurno) {
		this.idTurno = idTurno;
	}
	public long getIdCiclo() {
		return idCiclo;
	}
	public void setIdCiclo(long idCiclo) {
		this.idCiclo = idCiclo;
	}
	
	
	

}
