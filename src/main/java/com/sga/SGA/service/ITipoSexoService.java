package com.sga.SGA.service;
import java.util.List;

import com.sga.SGA.models.TipoSexo;

public interface ITipoSexoService {
	TipoSexo  resgistrar (TipoSexo tipoSexo);
	TipoSexo  modificar(TipoSexo tipoSexo);
	boolean eliminar(long id);
	List<TipoSexo> listar();
}
