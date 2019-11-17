package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryEstadosSolicitud;
import com.sga.SGA.models.EstadoSolicitud;
@Service
public class EstadoSolicitudService implements IEstadoSolicitudService {

	@Autowired
	private IRepositoryEstadosSolicitud repoSolicitud;
	@Override
	public EstadoSolicitud registrar(EstadoSolicitud estadosolicitud) {
		// TODO Auto-generated method stub
		return repoSolicitud.save(estadosolicitud);
	}

	@Override
	public EstadoSolicitud modificar(EstadoSolicitud estadosolicitud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EstadoSolicitud> listar() {
		// TODO Auto-generated method stub
		return repoSolicitud.findAll();
	}

}
