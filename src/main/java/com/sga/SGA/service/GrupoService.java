package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryCrusosCarreras;
import com.sga.SGA.Repository.IRepositoryGrupo;
import com.sga.SGA.models.CursosCarreras;
import com.sga.SGA.models.Grupo;


@Service
public class GrupoService implements IGrupoService {
	
	
	@Autowired
	private IRepositoryGrupo repoGrupo;

	@Autowired
	private IRepositoryCrusosCarreras repoCursos;
	@Override
	public Grupo registrar(Grupo grupo ) {
		// TODO Auto-generated method stub
		return repoGrupo.save(grupo);
	}

	@Override
	public Grupo modificar(Grupo grupo) {
		return repoGrupo.save(grupo);
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Grupo> listar() {
		// TODO Auto-generated method stub
		return repoGrupo.findAll();
	}

	@Override
	public Grupo ResgistraGrupoAndCursos(Grupo grupo, List<CursosCarreras> cursos) {
		Grupo g = repoGrupo.save(grupo);
		for(int i =0 ; i< cursos.size() ; i ++ ) {
			Grupo grupito = new Grupo();
			grupito.setId(g.getId());
			cursos.get(i).setGrupo(grupito);
			repoCursos.save(cursos.get(i));
		}
		
		return g;
	}

}
