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
            		+ "VALUES(seqrestaurante.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            p.setString(1, newRestaurante.getNome());
            p.setString(2, newRestaurante.getCnpj());
            p.setString(3, newRestaurante.getTelefone());
            p.setString(4, newRestaurante.getEmail());
            p.setInt(5, newRestaurante.getAlcance());
            p.setTime(6, newRestaurante.getHoraFuncionamento());
            p.setBoolean(7, newRestaurante.isFlagIso());
            p.setObject(8, newRestaurante.getFaixaPreco());
            p.setObject(9, newRestaurante.getConta());
            p.setObject(10, newRestaurante.getPlano());
            p.setObject(11, newRestaurante.getDono());
            p.setObject(12, newRestaurante.getEndereco());
            
            System.out.println(p);
            p.executeUpdate();
            System.out.println("Comando executado");
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


