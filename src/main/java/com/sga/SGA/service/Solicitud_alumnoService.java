package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sga.SGA.Repository.IRespositorySolicitud_alumno;


import com.sga.SGA.models.Solcitud_alumno;
@Service
public class Solicitud_alumnoService implements IUsuario_SolicitudService {
	@Autowired
	private IRespositorySolicitud_alumno repoSolicitudAlumno;
	@Override
	public Solcitud_alumno registrar(Solcitud_alumno solicirudALumno) {
		// TODO Auto-generated method stub
		return repoSolicitudAlumno.save(solicirudALumno);
	}

	@Override
	public Solcitud_alumno modificar(Solcitud_alumno solicitudAlumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Solcitud_alumno> listar() {
		// TODO Auto-generated method stub
		return repoSolicitudAlumno.findAll();
	}

}
