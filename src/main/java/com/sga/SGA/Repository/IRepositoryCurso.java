package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Curso;

public interface IRepositoryCurso extends JpaRepository<Curso, Long> {

}
