package com.sga.SGA.service;
import java.util.List;
import com.sga.SGA.models.TiposSolicitud;

public interface ITipoSolicitudService {
	TiposSolicitud registrar(TiposSolicitud tiposolicitud);
	TiposSolicitud modificar(TiposSolicitud tiposolcitud);
	boolean eliminar(long id);
	List<TiposSolicitud> listar();
}
