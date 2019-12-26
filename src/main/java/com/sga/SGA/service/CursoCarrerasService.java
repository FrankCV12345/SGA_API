package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryCrusosCarreras;
import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.models.Grupo;
@Service
public class CursoCarrerasService implements ICursosCarrerasService {

	@Autowired
	private IRepositoryCrusosCarreras repoCarreras;
	
	@Override
	public CursosCarreras Registrar(CursosCarreras curso) {
		// TODO Auto-generated method stub
		return repoCarreras.save(curso);
	}

	@Override
	public CursosCarreras updated(CursosCarreras curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CursosCarreras> lista() {
		// TODO Auto-generated method stub
		return repoCarreras.findAll();
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CursosCarreras> ListarCursosPorGrupo(Long idGrupo) {
		Grupo grupo = new Grupo();
		grupo.setId(idGrupo);
		return repoCarreras.findByGrupo(grupo);
	}

	@Override
	public boolean RegistraCursosParaGrupo(List<CursosCarreras> cursos) {
		// TODO Auto-generated method stub
		for(int  i =0 ; i < cursos.size() ; i ++) {
			repoCarreras.save(cursos.get(i));
		}
		return true;
	}

}
