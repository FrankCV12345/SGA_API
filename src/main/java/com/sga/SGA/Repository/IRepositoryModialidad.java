package com.sga.SGA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sga.SGA.models.modalida;

public interface IRepositoryModialidad extends JpaRepository<modalida, Long> {
	modalida findById(long id);
}
