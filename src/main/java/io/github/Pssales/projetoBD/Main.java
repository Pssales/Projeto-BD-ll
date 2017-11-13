package io.github.Pssales.projetoBD;

import io.github.Pssales.projetoBD.dao.ProdutoQuimicoDAO;
import io.github.Pssales.projetoBD.model.ProdutoQuimico;

public class Main {

	public static void main(String[] args) {
		ProdutoQuimicoDAO pqDAO = new ProdutoQuimicoDAO();
		
		ProdutoQuimico pq = new ProdutoQuimico();
		pq.setNomeComercial("asdasd");
		pqDAO.persist(pq);
		
		
	}

}
