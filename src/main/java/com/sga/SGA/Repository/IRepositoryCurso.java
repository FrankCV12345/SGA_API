package com.sga.SGA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.Curso;

public interface IRepositoryCurso extends JpaRepository<Curso, Long> {
	Curso findById(long id);
	List<Curso> findBySfotdelete(boolean sfotdelete);
}
