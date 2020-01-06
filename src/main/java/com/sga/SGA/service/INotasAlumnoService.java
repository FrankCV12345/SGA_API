package com.sga.SGA.service;
import java.util.List;

import com.sga.SGA.models.GrupoYCursoPorProfesor;
import com.sga.SGA.models.NotasAlumno;

public interface INotasAlumnoService {
	NotasAlumno registra(NotasAlumno nota);
	NotasAlumno actualizaNota(NotasAlumno nota);
	NotasAlumno NotasPorAlumnoYCuros(long  idAlumno, long idCursoCarrera);
	List<GrupoYCursoPorProfesor> ListaCursosPorseccionParaProfesor(long idprofesor);
}
