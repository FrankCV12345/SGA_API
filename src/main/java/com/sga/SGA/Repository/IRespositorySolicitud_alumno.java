package com.sga.SGA.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sga.SGA.models.EstadoSolicitud;
import com.sga.SGA.models.Solcitud_alumno;
import com.sga.SGA.models.Usuario;
public interface IRespositorySolicitud_alumno extends JpaRepository<Solcitud_alumno, Long> {

	List<Solcitud_alumno> findByUsuariosolicitud(Usuario user);
	Solcitud_alumno findById(int id);
	List<Solcitud_alumno> findByEstadosolicitud(EstadoSolicitud estado);
	List<Solcitud_alumno> findByUsuarioresponsable(Usuario responsable);
	@Query(value = "exec SP_ReporteSolicitudesEstadoSolicitudes", nativeQuery = true)
	List<Object[]> ListaEstadosSolicitud();

}
