package com.sga.SGA.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbTurnoCarrera")
public class TurnosCarreras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,length=40)
	private String nombreturno;
	@Column(nullable=false)
	private Time horainicio;
	@Column(nullable=false)
	private Time horafin;
	@Column(nullable=false,length=30)
	private String diasestudio;
	@Column(nullable=false)
	private boolean sfotdelete;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombreturno() {
		return nombreturno;
	}
	public void setNombreturno(String nombreturno) {
		this.nombreturno = nombreturno;
	}
	public Time getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(Time horainicio) {
		this.horainicio = horainicio;
	}
	public Time getHorafin() {
		return horafin;
	}
	public void setHorafin(Time horafin) {
		this.horafin = horafin;
	}
	public String getDiasestudio() {
		return diasestudio;
	}
	public void setDiasestudio(String diasestudio) {
		this.diasestudio = diasestudio;
	}
	public boolean isSfotdelete() {
		return sfotdelete;
	}
	public void setSfotdelete(boolean sfotdelete) {
		this.sfotdelete = sfotdelete;
	}
	public TurnosCarreras(long id) {
		super();
		this.id = id;
	}
	public TurnosCarreras() {
		super();
	}
	
	
	
}
