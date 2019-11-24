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
	@Column(name="descripioncurso",nullable=false,length=300)
	private String descripioncurso;	
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
	
	public boolean isSfotdelete() {
		return sfotdelete;
	}
	public void setSfotdelete(boolean sfotdelete) {
		this.sfotdelete = sfotdelete;
	}
	
	
	public String getDescripioncurso() {
		return descripioncurso;
	}
	public void setDescripioncurso(String descripioncurso) {
		this.descripioncurso = descripioncurso;
	}
	public Curso(long id) {
		super();
		this.id = id;
	}
	public Curso() {
		super();
	}
	
	

}
