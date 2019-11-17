package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryTipoDNI;
import com.sga.SGA.models.TipoDNI;
@Service
public class TipoDNIService implements ITipoDNIservice {
	
	@Autowired
	private IRepositoryTipoDNI repoTipoDNI;

	@Override
	public TipoDNI registrar(TipoDNI tipoDNI) {
		// TODO Auto-generated method stub
		return repoTipoDNI.save(tipoDNI);
	}

	@Override
	public TipoDNI actualziar(TipoDNI tipoDNI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TipoDNI> listar() {
		// TODO Auto-generated method stub
		return repoTipoDNI.findAll();
	}

}
