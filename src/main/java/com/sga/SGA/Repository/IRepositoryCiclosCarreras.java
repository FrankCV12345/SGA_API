package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Carreras;
import com.sga.SGA.models.CiclosCarreras;

public interface IRepositoryCiclosCarreras extends JpaRepository<CiclosCarreras, Long> {
	List<CiclosCarreras> findByCarrera(Carreras Ccarrera);

}
