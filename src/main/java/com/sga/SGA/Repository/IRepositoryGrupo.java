package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sga.SGA.models.Grupo;

public interface IRepositoryGrupo extends JpaRepository<Grupo,Long> {
		Grupo findByid(long id);
		@Query(value=" exec SP_Reporte_resumen_cantidades",nativeQuery = true)
		List<Object[]> ResumenDeCantidades();
}
