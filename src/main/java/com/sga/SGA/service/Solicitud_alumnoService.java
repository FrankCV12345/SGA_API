package com.sga.SGA.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sga.SGA.Repository.IRespositorySolicitud_alumno;
import com.sga.SGA.models.EstadoSolicitud;
import com.sga.SGA.models.Solcitud_alumno;
import com.sga.SGA.models.Usuario;;
@Service
public class Solicitud_alumnoService implements IUsuario_SolicitudService {
	@Autowired
	private IRespositorySolicitud_alumno repoSolicitudAlumno;
	@Override
	public Solcitud_alumno registrar(Solcitud_alumno solicirudALumno) {
		// TODO Auto-generated method stub
		java.util.Date utilDate = new java.util.Date();
		solicirudALumno.setEstadosolicitud(new EstadoSolicitud(3));
		solicirudALumno.setFechaingresosolicitud(new Date(utilDate.getTime()));
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

	@Override
	public List<Solcitud_alumno> buscaPorIdAlumno(long id ) {
		// TODO Auto-generated method stub
		Usuario userBusqueda = new Usuario();
		userBusqueda.setId(id);
		return repoSolicitudAlumno.findByUsuariosolicitud(userBusqueda);
	}

}
