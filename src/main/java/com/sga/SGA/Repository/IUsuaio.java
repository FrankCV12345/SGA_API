package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Grupo;
import com.sga.SGA.models.TipoRol;
import com.sga.SGA.models.Usuario;

public interface IUsuaio extends JpaRepository<Usuario,Long> {
	
	Usuario findByNombre(String nombreUser);
	Usuario findByCorreo(String correoUser);
	Usuario findById(long id);
	List<Usuario> findByRol(TipoRol rol);
	List<Usuario> findByGrupo(Grupo grupo);	
	Usuario findByIsHabilitado(boolean estado);
}
