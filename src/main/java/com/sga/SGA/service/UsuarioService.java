package com.sga.SGA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IUsuaio;
import com.sga.SGA.models.Usuario;
@Service
public class UsuarioService implements IUsuarioService{
	@Autowired
	private IUsuaio iusario;
	@Autowired
	private BCryptPasswordEncoder encoder;

	

	@Override
	public boolean Eliminar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		
		return iusario.findAll();
	}


	@Override
	public Page<Usuario> listaPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario listarPorId(long idUser) {
		// TODO Auto-generated method stub
		return iusario.findById(idUser);//iusario.findOne(idUser);
	}

	@Override
	public Usuario registrar(Usuario user) {
		// TODO Auto-generated method stub
		user.setPassword(encoder.encode(user.getPassword()));
		return iusario.save(user);
	}

	@Override
	public Usuario Modificar(long id, Usuario user) {
		// TODO Auto-generated method stub
		Usuario User = iusario.findById(id);
		User.setNombre(user.getNombre());
		User.setApellidos(user.getApellidos());
		User.setCorreo(user.getCorreo());
		User.setDni(user.getDni());
		User.setTelefono(user.getTelefono());
		Usuario UserUpdated = iusario.save(User);
		return UserUpdated;
	}


}
