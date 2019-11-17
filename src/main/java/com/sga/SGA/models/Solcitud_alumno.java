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
@Table(name="tbsolicitudAlumno")
public class Solcitud_alumno {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(name="comentarios",nullable =true,length =250)
	private String  comentarios;
	@Column(name="fechaingresosolicitud",nullable=false)
	private Date fechaingresosolicitud;
	
	//Claves foraneas
	@ManyToOne
	private Usuario usuariosolicitud;
	@ManyToOne
	private Usuario usuarioresponsable;
	@ManyToOne
	private TiposSolicitud tiposolicitud;
	@ManyToOne
	private EstadoSolicitud estadosolicitud;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public Date getFechaingresosolicitud() {
		return fechaingresosolicitud;
	}
	public void setFechaingresosolicitud(Date fechaingresosolicitud) {
		this.fechaingresosolicitud = fechaingresosolicitud;
	}
	public Usuario getUsuariosolicitud() {
		return usuariosolicitud;
	}
	public void setUsuariosolicitud(Usuario usuariosolicitud) {
		this.usuariosolicitud = usuariosolicitud;
	}
	public Usuario getUsuarioresponsable() {
		return usuarioresponsable;
	}
	public void setUsuarioresponsable(Usuario usuarioresponsable) {
		this.usuarioresponsable = usuarioresponsable;
	}
	public TiposSolicitud getTiposolicitud() {
		return tiposolicitud;
	}
	public void setTiposolicitud(TiposSolicitud tiposolicitud) {
		this.tiposolicitud = tiposolicitud;
	}
	public EstadoSolicitud getEstadosolicitud() {
		return estadosolicitud;
	}
	public void setEstadosolicitud(EstadoSolicitud estadosolicitud) {
		this.estadosolicitud = estadosolicitud;
	}
	public Solcitud_alumno(int id, String comentarios, Date fechaingresosolicitud, Usuario usuariosolicitud,
			Usuario usuarioresponsable, TiposSolicitud tiposolicitud, EstadoSolicitud estadosolicitud) {
		super();
		this.id = id;
		this.comentarios = comentarios;
		this.fechaingresosolicitud = fechaingresosolicitud;
		this.usuariosolicitud = usuariosolicitud;
		this.usuarioresponsable = usuarioresponsable;
		this.tiposolicitud = tiposolicitud;
		this.estadosolicitud = estadosolicitud;
	}
	public Solcitud_alumno() {
		super();
	}
	
}
