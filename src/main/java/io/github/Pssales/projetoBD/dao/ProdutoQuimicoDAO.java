package io.github.Pssales.projetoBD.dao;

import java.util.List;

import io.github.Pssales.projetoBD.model.ProdutoQuimico;


public class ProdutoQuimicoDAO extends DAO<ProdutoQuimico> {

	public ProdutoQuimico getById(final Long id) {
        return entityManager.find(ProdutoQuimico.class, id);
    }
 
    public boolean removeById(final Long id) {
    	
    	boolean result = true;
    	
        try {
        	ProdutoQuimico product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
        
        return result;
    }
 
    @SuppressWarnings("unchecked")
	public List<ProdutoQuimico> findAll() {
    	return entityManager
    		.createQuery("FROM Product").getResultList();
    }
}
