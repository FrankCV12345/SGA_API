package com.sga.SGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbCurso")
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false,length=30)
	private String nombrecurso;
	@Column(nullable=false,length=30)
	private String descripion;
	private boolean sfotdelete;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombrecurso() {
		return nombrecurso;
	}
	public void setNombrecurso(String nombrecurso) {
		this.nombrecurso = nombrecurso;
	}
	public String getDescripion() {
		return descripion;
	}
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
	public boolean isSfotdelete() {
		return sfotdelete;
	}
	public void setSfotdelete(boolean sfotdelete) {
		this.sfotdelete = sfotdelete;
	}
	public Curso(long id) {
		super();
		this.id = id;
	}
	public Curso() {
		super();
	}
	
	

}
