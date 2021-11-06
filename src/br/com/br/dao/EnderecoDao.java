package br.com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.Endereco;


public class EnderecoDao {

    public EnderecoDao() {

    }

    //---------------------------------------------------


    public void addEndereco (Endereco newEndereco) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_ENDERECO(CD_ENDERECO, SG_ESTADO, NM_CIDADE, NR_CEP, DS_LOGRADOURO, NR_NUMERO, DS_COMPLEMENTO) values (seqendereco.nextval, ?, ?, ?, ?, ?, ?)");
            p.setString(1, newEndereco.getNomeCidade());
            p.setString(2, newEndereco.getSiglaEstado());
            p.setString(3, newEndereco.getCep());
            p.setString(4, newEndereco.getLogradouro());
            p.setInt(5, newEndereco.getNumero());
            p.setString(6, newEndereco.getComplemento());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
