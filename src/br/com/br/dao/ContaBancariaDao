package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.ContaBancaria;


public class ContaBancariaDao {

    public ContaBancariaDao() {

    }

    //---------------------------------------------------


    public void addContaBancaria (ContaBancaria newContaBancaria) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_CT_BANCARIA(CD_CONTA, NR_CONTA, NR_AGENCIA, DS_TIPO, NM_TITULAR) values (seqcontabancaria.nextval, ?, ?, ?, ?)");
            p.setInt(1, newContaBancaria.getNumero());
            p.setInt(1, newContaBancaria.getAgencia());
            p.setString(1, newContaBancaria.getTipo());
            p.setString(1, newContaBancaria.getNomeTitular());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
