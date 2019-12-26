package com.sga.SGA.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Size(min = 2, max = 40)
	@Column(name="nombre",nullable=false,length=60)
	private String  nombre;
	@Column(name="apellidos",nullable=false,length=140,columnDefinition=" varchar(140) default 'Sin apellido'")
	private String  apellidos;
	@Column(name="direcion",nullable=false,length=180)
	private String direcion;
	
	@Column(name="dni",nullable=false,unique=true,length=8)
	private String dni;
	@Column(name="correo",nullable=false,unique=true,length=180)
	private String correo;
	
	@Column(name="telefono",nullable=false,length=14)
	private String telefono;
	@Column(name="password",nullable=false,length=180)
	private String password;
	@Column(name="nombreColegio",nullable=true,length=180)
	private String nombreColegio;
	@Column(name="isHabilitado",nullable=false)
	private boolean isHabilitado ;
	@Column(name="fechaNacimiento",nullable=false)
	private Date fechaNacimiento;
	@Column(name="fechaRegistrado",nullable=false)
	private Date fechaRegistrado;
	@Transient
	private String token;
	//Claves foraneas
	@ManyToOne
	private TipoDNI TipoDoc;
	@ManyToOne
	private TipoSexo Sexo;
	@ManyToOne
	private Sede Sede;
	@ManyToOne
	private TipoRol rol;
	@ManyToOne
	private Grupo grupo;
	
	public Usuario(long idUser, @Size(min = 2, max = 40) String nombre, String direcion, String dni, String correo,
			String telefono, String password, String nombreColegio, boolean isHabilitado, Date fechaNacimiento,
			Date fechaRegistrado) {
		super();
		this.id = idUser;
		this.nombre = nombre;
		this.direcion = direcion;
		this.dni = dni;
		this.correo = correo;
		this.telefono = telefono;
		this.password = password;
		this.nombreColegio = nombreColegio;
		this.isHabilitado = isHabilitado;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistrado = fechaRegistrado;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Usuario [idUser=" + id + ", nombre=" + nombre + ", direcion=" + direcion + ", dni=" + dni
				+ ", correo=" + correo + ", telefono=" + telefono + ", password=" + password + ", nombreColegio="
				+ nombreColegio + ", isHabilitado=" + isHabilitado + ", fechaNacimiento=" + fechaNacimiento
				+ ", fechaRegistrado=" + fechaRegistrado + "]";
	}
	public long getIdUser() {
		return id;
	}
	public void setIdUser(long idUser) {
		this.id = idUser;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombreColegio() {
		return nombreColegio;
	}
	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}
	public boolean isHabilitado() {
		return isHabilitado;
	}
	public void setHabilitado(boolean isHabilitado) {
		this.isHabilitado = isHabilitado;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaRegistrado() {
		return fechaRegistrado;
	}
	public void setFechaRegistrado(Date fechaRegistrado) {
		this.fechaRegistrado = fechaRegistrado;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TipoDNI getTipoDoc() {
		return TipoDoc;
	}
	public void setTipoDoc(TipoDNI tipoDoc) {
		TipoDoc = tipoDoc;
	}
	public TipoSexo getSexo() {
		return Sexo;
	}
	public void setSexo(TipoSexo sexo) {
		Sexo = sexo;
	}
	public Sede getSede() {
		return Sede;
	}
	public void setSede(Sede sede) {
		Sede = sede;
	}
	public TipoRol getRol() {
		return rol;
	}
	public void setRol(TipoRol rol) {
		this.rol = rol;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	

	
		
}
