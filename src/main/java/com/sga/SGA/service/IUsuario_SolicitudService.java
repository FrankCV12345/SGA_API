package com.sga.SGA.service;
import java.util.List;

import com.sga.SGA.models.Solcitud_alumno;
public interface IUsuario_SolicitudService {
	
	Solcitud_alumno registrar( Solcitud_alumno solicirudALumno);
	Solcitud_alumno modificar( Solcitud_alumno solicitudAlumno);
	boolean aliminar(long id);
	List<Solcitud_alumno> listar();
}
