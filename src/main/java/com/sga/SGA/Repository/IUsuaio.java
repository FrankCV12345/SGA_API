package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sga.SGA.models.Usuario;

public interface IUsuaio extends JpaRepository<Usuario,Long> {
	
	Usuario findByNombre(String nombreUser);
	Usuario findByCorreo(String correoUser);
	Usuario findById(long id);
}
