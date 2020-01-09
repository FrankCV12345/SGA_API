package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sga.SGA.models.Grupo;

public interface IRepositoryReportes extends JpaRepository<Grupo,Long> {
	@Query(value=" exec SP_Reporte_cantida_registrado_por_dia",nativeQuery = true)
	List<Object[]> AlumnosRegistradosPorDia();
	
	@Query(value=" exec SP_reporteCantidadAlumnoPorSeccion",nativeQuery = true)
	List<Object[]> reporteAlumnosPorSeccion();
}
