package com.sga.SGA.models;

public class GrupoYCursoPorProfesor {
	private long idCurso_grupo;
	private long idGrupo;
	private String nombreCurso;
	public GrupoYCursoPorProfesor() {
		super();
	}
	public GrupoYCursoPorProfesor(long idCurso_grupo, long idGrupo, String nombreCurso) {
		super();
		this.idCurso_grupo = idCurso_grupo;
		this.idGrupo = idGrupo;
		this.nombreCurso = nombreCurso;
	}
	public long getIdCurso_grupo() {
		return idCurso_grupo;
	}
	public void setIdCurso_grupo(long idCurso_grupo) {
		this.idCurso_grupo = idCurso_grupo;
	}
	public long getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(long idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	
	
}
