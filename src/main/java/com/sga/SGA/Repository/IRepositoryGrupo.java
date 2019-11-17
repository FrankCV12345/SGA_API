package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Grupo;

public interface IRepositoryGrupo extends JpaRepository<Grupo,Long> {
		Grupo findByid(long id);
}
