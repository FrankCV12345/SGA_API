package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Sede;

public interface IRepositorySede extends JpaRepository<Sede,Long> {
	Sede findById(long id);
}
