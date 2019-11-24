package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.TurnosCarreras;

public interface IRepositoryTurnosCarreras extends JpaRepository<TurnosCarreras, Long> {
	
	TurnosCarreras findById(long id);

}
