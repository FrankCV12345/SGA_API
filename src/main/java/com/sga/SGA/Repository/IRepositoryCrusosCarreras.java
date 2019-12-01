package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.CursosCarreras;

import com.sga.SGA.models.Grupo;

public interface IRepositoryCrusosCarreras extends JpaRepository<CursosCarreras, Long> {
	
	CursosCarreras findById(long id);
	List<CursosCarreras> findByGrupo(Grupo grupo);
}
