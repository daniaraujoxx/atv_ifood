package br.com.factory;

import br.com.br.dao.CategoriaDao;

public class DAOFactory {

	public static CategoriaDao getCategoriaDao() {
		return new CategoriaDao();
	}

}
