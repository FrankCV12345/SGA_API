package com.sga.SGA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//Esta tabbla se debería llamar tbCursoGrupo error  mio 01/12/2019 
@Entity
@Table(name="tbCursosCarreras")
public class CursosCarreras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	//claves foraneas
	@ManyToOne
	private Curso curso;
	@ManyToOne
	private Usuario profesor;
	@ManyToOne
	private Grupo grupo;
	@ManyToOne
	private Carreras carrera;
	
	private boolean softdelte;
	
	public CursosCarreras(long id) {
		super();
		this.id = id;
	}

	public CursosCarreras() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Usuario getProfesor() {
		return profesor;
	}

	public void setProfesor(Usuario profesor) {
		this.profesor = profesor;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Carreras getCarrera() {
		return carrera;
	}

	public void setCarrera(Carreras carrera) {
		this.carrera = carrera;
	}

	public boolean isSoftdelte() {
		return softdelte;
	}

	public void setSoftdelte(boolean softdelte) {
		this.softdelte = softdelte;
	}
	
	
	
	
	
	
	
}
