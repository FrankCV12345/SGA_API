package com.sga.SGA.service;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.sga.SGA.models.Usuario;
public interface IUsuarioService {
	Usuario registrar ( Usuario user);
	Usuario Modificar(long id , Usuario user);
	boolean Eliminar(long id);
	boolean Habilitar(long id);
	Usuario ModificaPassword(long id, String pass, String newPass);
	List<Usuario> listar();
	Usuario listarPorId(long idUser);
	Page<Usuario> listaPageable(Pageable pageable);
	List<Usuario> ListaUsuarioProfesor();
	List<Usuario> ListaUsuarioAlumno();
	List<Usuario> ListaAlumnosPorGrupo(long idGrupo);
	
}
