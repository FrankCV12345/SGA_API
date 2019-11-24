package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.CursosCarreras;

public interface IRepositoryCrusosCarreras extends JpaRepository<CursosCarreras, Long> {
	
	CursosCarreras findById(long id);
	

}
