package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sga.SGA.models.CalificacionAlumnoProfesor;
import com.sga.SGA.models.Usuario;

public interface IRepositoryCalificacionAlumnoPofesor extends JpaRepository<CalificacionAlumnoProfesor, Long> {
		List<CalificacionAlumnoProfesor> findByProfesorcalificado(Usuario profesor);
		CalificacionAlumnoProfesor findById(long id);
		CalificacionAlumnoProfesor findByProfesorcalificadoAndAlumnocalifica(Usuario profesorcalificado , Usuario alumnocalifica);
		@Query(value = "exec SP_BuscaProfesorPorGrupo ?1", nativeQuery = true)
		List<Object[]> ListaProfesorPorGrupo(long idgrupo);
		@Query(value = "exec SP_ReporteCalificacionesPorProfesor", nativeQuery = true)
		List<Object[]> ListaProfesoresPromedioCalificacion();
		@Query(value="SP_verdificaregistroDeCalificacion ?1,?2 ", nativeQuery = true)
		List<Object[]> VerificaCAlificacion(long idprofe, long idAlumno);
		
}
