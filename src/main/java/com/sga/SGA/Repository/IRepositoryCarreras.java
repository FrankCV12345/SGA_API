package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Carreras;

public interface IRepositoryCarreras extends JpaRepository<Carreras, Long> {

	Carreras findById(long id);
}
