package com.sga.SGA.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sga.SGA.models.Solcitud_alumno;
import com.sga.SGA.models.Usuario;
public interface IRespositorySolicitud_alumno extends JpaRepository<Solcitud_alumno, Long> {

	List<Solcitud_alumno> findByUsuariosolicitud(Usuario user);

}
