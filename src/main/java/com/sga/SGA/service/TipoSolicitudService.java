package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sga.SGA.models.TiposSolicitud;
import com.sga.SGA.Repository.IRespositoryTipoSolictud;
import org.springframework.stereotype.Service;

@Service
public class TipoSolicitudService implements ITipoSolicitudService {
	@Autowired
	private IRespositoryTipoSolictud repoTiposSolicitud;
	@Override
	public TiposSolicitud registrar(TiposSolicitud tiposolicitud) {
		// TODO Auto-generated method stub
		return repoTiposSolicitud.save(tiposolicitud);
	}

	@Override
	public TiposSolicitud modificar(TiposSolicitud tiposolcitud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TiposSolicitud> listar() {
		// TODO Auto-generated method stub
		return repoTiposSolicitud.findAll();
	}

}
