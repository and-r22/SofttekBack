package com.softtek.repo;

import com.softtek.modelo.Usuario;

public interface IUsuario extends IGenericRepo<Usuario, Integer> {

	Usuario findOneByUsername(String username);
	
}
