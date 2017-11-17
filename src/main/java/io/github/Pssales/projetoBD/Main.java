package io.github.Pssales.projetoBD;

import io.github.Pssales.projetoBD.dao.RequerimentoDAO;
import io.github.Pssales.projetoBD.model.Requerimento;

public class Main {

    public static void main(String[] args) {
        RequerimentoDAO pqDAO = new RequerimentoDAO();

        Requerimento pq = new Requerimento();
        pq.setNome("teste");
        pq.setPrazo(12);
        pqDAO.persist(pq);

    }

}
