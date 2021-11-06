package br.com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.Pagamento;


public class PagamentoDao {

    public PagamentoDao() {

    }


    //---------------------------------------------------


    public void addPagamento (Pagamento newPagamento) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_PAGAMENTO(CD_TIPO, DS_TIPO) values (seqpagamento.nextval, ?)");
            p.setString(1, newPagamento.getDescricao());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
