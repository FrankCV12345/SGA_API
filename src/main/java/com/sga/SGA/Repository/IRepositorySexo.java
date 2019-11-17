package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.TipoSexo;

public interface IRepositorySexo extends JpaRepository<TipoSexo,Long> {
	TipoSexo findById(long id);

}
