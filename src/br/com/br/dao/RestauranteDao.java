package br.com.br.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.connection.ConexaoBD;
import br.com.model.Restaurante;

public class RestauranteDao {
	
    public RestauranteDao() {

    }

    public void addRestaurante (Restaurante newRestaurante) {
        ConexaoBD c = ConexaoBD.getInstance();
        Connection con = c.getConnection();

        try {
            PreparedStatement p = con.prepareStatement("INSERT INTO T_RESTAURANTE(CD_RESTAURANTE, NM_RESTAURANTE, NR_CNPJ, NR_TELEFONE, DS_EMAIL, DS_ALCANCE, HR_FUNCIONAMENTO,\r\n"
            		+ "FLAG_ISO14001, T_FX_PRECO_CD_FAIXA, T_CT_BANCARIA_CD_CONTA, T_PLANO_CD_PLANO, T_DONO_CD_PROPRIETARIO, T_ENDERECO_CD_ENDERECO)\r\n"
            		+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            p.setInt(1, newRestaurante.getCodigo());
            p.setString(2, newRestaurante.getNome());
            p.setString(3, newRestaurante.getCnpj());
            p.setString(4, newRestaurante.getTelefone());
            p.setString(5, newRestaurante.getEmail());
            p.setInt(6, newRestaurante.getAlcance());
            p.setTime(8, newRestaurante.getHoraFuncionamento());
            p.setBoolean(9, newRestaurante.isFlagIso());
            p.setObject(11, newRestaurante.getFaixaPreco());
            p.setObject(12, newRestaurante.getConta());
            p.setObject(12, newRestaurante.getPlano());
            p.setObject(13, newRestaurante.getDono());
            p.setObject(14, newRestaurante.getEndereco());
            
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


