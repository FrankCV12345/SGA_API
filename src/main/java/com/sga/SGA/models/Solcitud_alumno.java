package com.sga.SGA.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Usuario usuariosolicitud;
	private Usuario usuarioresponsable;
	private TiposSolicitud tiposolicitud;
	private EstadoSolicitud estadosolicitud;
}
