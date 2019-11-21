package com.sga.SGA.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbCalificacionAlumnoProfesor")
public class CalificacionAlumnoProfesor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="dominatema",nullable =false)
	private int Dominatema;
	@Column(name="aclaradudas",nullable =false)
	private int aclaradudas;
	@Column(name="expresaclaramente",nullable =false)
	private int expresaclaramente;
	@Column(name="comentario",nullable =true,length=220)
	private String comentario;
	@Column(name="fechaingresocalificacion",nullable =false)
	private Date fechacalificacion;
	
	@Column(name="softdelete",nullable =false)
	private boolean softdelete;
	
	//claves foraneas
	@ManyToOne
	private Usuario profesorcalificado;
	@ManyToOne
	private Usuario alumnocalifica;
	public CalificacionAlumnoProfesor() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getDominatema() {
		return Dominatema;
	}
	public void setDominatema(int dominatema) {
		Dominatema = dominatema;
	}
	public int getAclaradudas() {
		return aclaradudas;
	}
	public void setAclaradudas(int aclaradudas) {
		this.aclaradudas = aclaradudas;
	}
	public int getExpresaclaramente() {
		return expresaclaramente;
	}
	public void setExpresaclaramente(int expresaclaramente) {
		this.expresaclaramente = expresaclaramente;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Date getFechacalificacion() {
		return fechacalificacion;
	}
	public void setFechacalificacion(Date fechacalificacion) {
		this.fechacalificacion = fechacalificacion;
	}
	public Usuario getProfesorcalificado() {
		return profesorcalificado;
	}
	public void setProfesorcalificado(Usuario profesorcalificado) {
		this.profesorcalificado = profesorcalificado;
	}
	public Usuario getAlumnocalifica() {
		return alumnocalifica;
	}
	public void setAlumnocalifica(Usuario alumnocalifica) {
		this.alumnocalifica = alumnocalifica;
	}
	
	

}
