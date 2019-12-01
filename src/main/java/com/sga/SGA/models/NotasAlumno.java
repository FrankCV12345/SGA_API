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
@Table(name="tbNotasAlumno")
public class NotasAlumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=true)
	private Double nota1;
	@Column(nullable=true)
	private Double nota2;
	@Column(nullable=true)
	private Double nota3;
	@Column(nullable=true)
	private double examenfinal;
	@Column(nullable=true,length=20)
	private String estadoaprobado;
	@Column(nullable=true)
	private Date fechaaultimaActualizacion;
	//claves foraneas
	@ManyToOne
	private Usuario alumno;
	@ManyToOne
	private Grupo grupo;
	@ManyToOne
	private CursosCarreras curso;
	
	
	
	public NotasAlumno() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public double getExamenfinal() {
		return examenfinal;
	}
	public void setExamenfinal(double examenfinal) {
		this.examenfinal = examenfinal;
	}
	public String getEstadoaprobado() {
		return estadoaprobado;
	}
	public void setEstadoaprobado(String estadoaprobado) {
		this.estadoaprobado = estadoaprobado;
	}
	public Date getFechaaultimaActualizacion() {
		return fechaaultimaActualizacion;
	}
	public void setFechaaultimaActualizacion(Date fechaaultimaActualizacion) {
		this.fechaaultimaActualizacion = fechaaultimaActualizacion;
	}
	public Usuario getAlumno() {
		return alumno;
	}
	public void setAlumno(Usuario alumno) {
		this.alumno = alumno;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public CursosCarreras getCurso() {
		return curso;
	}
	public void setCurso(CursosCarreras curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
	
}
