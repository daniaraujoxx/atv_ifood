package br.com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {

	private static ConexaoBD conexao;

	private ConexaoBD() {
	}

	public static ConexaoBD getInstance() {
		if (conexao == null) {
			conexao = new ConexaoBD();
		}
		return conexao;
	}

	public Connection getConnection() {
		Connection connection = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88325",
					"150296");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
