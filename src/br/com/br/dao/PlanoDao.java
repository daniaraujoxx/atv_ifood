package br.com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.Plano;


public class PlanoDao {

    public PlanoDao() {

    }


    //---------------------------------------------------


    public void addPlano (Plano newPlano) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_PLANO(CD_PLANO, DS_PLANO) values (seqplano.nextval, ?)");
            p.setString(1, newPlano.getDescricao());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
