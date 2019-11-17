package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.TipoDNI;

public interface IRepositoryTipoDNI extends JpaRepository <TipoDNI,Long> {
	TipoDNI findById(long id);

}
