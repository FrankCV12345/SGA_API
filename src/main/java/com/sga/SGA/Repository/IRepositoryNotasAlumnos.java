package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Curso;
import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.models.Grupo;
import com.sga.SGA.models.NotasAlumno;
import com.sga.SGA.models.Usuario;

import java.util.List;

public interface IRepositoryNotasAlumnos extends JpaRepository<NotasAlumno, Long> {

	NotasAlumno findByAlumnoAndCurso(Usuario alumno,CursosCarreras curso);
	
	
}
