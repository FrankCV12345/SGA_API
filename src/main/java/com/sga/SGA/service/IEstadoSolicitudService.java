package com.sga.SGA.service;
import java.util.List;

import com.sga.SGA.models.EstadoSolicitud;

public interface IEstadoSolicitudService {
	
	EstadoSolicitud registrar(EstadoSolicitud estadosolicitud);
	EstadoSolicitud modificar(EstadoSolicitud estadosolicitud);
	boolean eliminar(long id );
	List<EstadoSolicitud> listar();

}
