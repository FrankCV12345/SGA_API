package com.sga.SGA.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sga.SGA.Repository.IRespositorySolicitud_alumno;
import com.sga.SGA.models.EstadoSolicitud;
import com.sga.SGA.models.ReporteEstadoSolicitud;
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
		solicirudALumno.setEstadosolicitud(new EstadoSolicitud(1));
		solicirudALumno.setFechaingresosolicitud(new Date(utilDate.getTime()));
		return repoSolicitudAlumno.save(solicirudALumno);
	}

	@Override
	public Solcitud_alumno modificarEstado(int idSolicitud,Solcitud_alumno solicitudAlumno) {
		// TODO Auto-generated method stub
		
		Solcitud_alumno updatedSolcitud_alumno = repoSolicitudAlumno.findById(idSolicitud);
		updatedSolcitud_alumno.setEstadosolicitud(solicitudAlumno.getEstadosolicitud());
		return repoSolicitudAlumno.save(updatedSolcitud_alumno);
	}
	
	@Override
	public Solcitud_alumno modificarEstadoSecretaria(Solcitud_alumno solicitudAlumno) {
		// TODO Auto-generated method stub
		Solcitud_alumno updatedSolcitud_alumno = repoSolicitudAlumno.findById(solicitudAlumno.getId() );
		updatedSolcitud_alumno.setUsuarioresponsable(solicitudAlumno.getUsuarioresponsable());
		updatedSolcitud_alumno.setEstadosolicitud(solicitudAlumno.getEstadosolicitud());
		return repoSolicitudAlumno.save(updatedSolcitud_alumno);
	}
	
	@Override
	public List<Solcitud_alumno> listarPorResponsable(long id) {
		// TODO Auto-generated method stub
		Usuario responsable = new Usuario();
		responsable.setId(id);
		return repoSolicitudAlumno.findByUsuarioresponsable(responsable);
	}

	@Override
	public boolean aliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Solcitud_alumno> listar() {
		// TODO Auto-generated method stub
		EstadoSolicitud estado  = new EstadoSolicitud(1);
			
		return repoSolicitudAlumno.findByEstadosolicitud(estado);
	}

	@Override
	public List<Solcitud_alumno> buscaPorIdAlumno(long id ) {
		// TODO Auto-generated method stub
		Usuario userBusqueda = new Usuario();
		userBusqueda.setId(id);
		return repoSolicitudAlumno.findByUsuariosolicitud(userBusqueda);
	}

	@Override
	public List<ReporteEstadoSolicitud> ReportePorEstadoSolicitud() {
		
		List<Object[]> lista = repoSolicitudAlumno.ListaEstadosSolicitud();
		List<ReporteEstadoSolicitud> listaReporteEstadosSolicitud = new ArrayList<>();
		// TODO Auto-generated method stub
		for(Object[] obj : lista) {
			ReporteEstadoSolicitud reporte = new ReporteEstadoSolicitud(obj[0].toString(), Integer.parseInt(obj[1].toString()));
			listaReporteEstadosSolicitud.add(reporte);
		}
		return listaReporteEstadosSolicitud;
	}

	

	
}
