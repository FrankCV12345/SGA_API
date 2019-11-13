package com.sga.SGA.service;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.sga.SGA.models.Usuario;
public interface IUsuarioService {
	Usuario registrar ( Usuario user);
	Usuario Modificar(long id , Usuario user);
	boolean Eliminar();
	List<Usuario> listar();
	Usuario listarPorId(long idUser);
	Page<Usuario> listaPageable(Pageable pageable);
	
}
