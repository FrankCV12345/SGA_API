package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.TipoRol;

public interface IRepositoryTipoRol extends JpaRepository<TipoRol, Long> {
	
	TipoRol findById(long id);

}
