package br.com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.Categoria;


public class CategoriaDao {

    public CategoriaDao() {

    }

    //---------------------------------------------------


    public void addCategoria (Categoria newCategoria) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("insert into t_categoria (cd_categoria, ds_categoria) values (seqcat.nextval, ?)");
            p.setString(1, newCategoria.getDescricao());
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
