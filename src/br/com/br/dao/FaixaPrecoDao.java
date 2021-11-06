package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.FaixaPreco;


public class FaixaPrecoDao {

    public FaixaPrecoDao() {

    }


    //---------------------------------------------------


    public void addFaixaPreco (FaixaPreco newFaixaPreco) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_FX_PRECO(CD_FAIXA, DS_FAIXA, NR_VALOR_MEDIO) values (seqfaixapreco.nextval, ?, ?)");
            p.setString(1, newFaixaPreco.getDescricao());
            p.setDouble(2, newFaixaPreco.getValorMedio());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
