package br.com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.Dono;


public class DonoDao {

    public DonoDao() {

    }

    //---------------------------------------------------


    public void addDono (Dono newDono) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_DONO(CD_PROPRIETARIO, NM_PROPRIETARIO, NR_CPF, NR_RG) values (seqdono.nextval, ?, ?, ?)");
            p.setString(1, newDono.getNome());
            p.setString(1, newDono.getCpf());
            p.setString(1, newDono.getRg());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
