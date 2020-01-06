package com.sga.SGA.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IUsuaio;
import com.sga.SGA.models.Grupo;
import com.sga.SGA.models.TipoDNI;
import com.sga.SGA.models.TipoRol;
import com.sga.SGA.models.TipoSexo;
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
		java.util.Date utilDate = new java.util.Date();
		user.setPassword(encoder.encode( user.getDni() ));
		user.setHabilitado(true);
		user.setFechaRegistrado(new Date(utilDate.getTime()));
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
		User.setTipoDoc(new TipoDNI(user.getTipoDoc().getId()));
		User.setSexo(new TipoSexo(user.getSexo().getId()));
		if(user.getGrupo() != null) {
			User.setGrupo(user.getGrupo());
		}
		Usuario UserUpdated = iusario.save(User);
		return UserUpdated;
	}

	@Override
	public List<Usuario> ListaUsuarioProfesor() {

		TipoRol rol = new TipoRol();
		rol.setId(2);
		return iusario.findByRol(rol);
	}

	@Override
	public List<Usuario> ListaUsuarioAlumno() {
		TipoRol rol = new TipoRol();
		rol.setId(1);
		return iusario.findByRol(rol);
	}

	@Override
	public List<Usuario> ListaAlumnosPorGrupo(long idGrupo) {

		Grupo g  = new Grupo();
		g.setId(idGrupo);
		return iusario.findByGrupo(g);
	}


}
