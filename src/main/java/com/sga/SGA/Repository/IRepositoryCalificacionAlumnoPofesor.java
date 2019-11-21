package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.CalificacionAlumnoProfesor;
import com.sga.SGA.models.Usuario;

public interface IRepositoryCalificacionAlumnoPofesor extends JpaRepository<CalificacionAlumnoProfesor, Long> {
		List<CalificacionAlumnoProfesor> findByProfesorcalificado(Usuario profesor);
		CalificacionAlumnoProfesor findById(long id);
}
