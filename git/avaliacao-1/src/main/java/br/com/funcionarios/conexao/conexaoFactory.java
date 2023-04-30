package br.com.funcionarios.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoFactory {

	private static final String usuario = "root";
	private static final String senha = "963044jeff";
	private static final String URL = "jdbc:mysql://localhost:3306/bdfuncionarios";
	
	public static Connection conectar() throws SQLException{
		Connection conexao = DriverManager.getConnection(URL,usuario,senha);
		return conexao;
	}
	public static void main(String[] args) {
		try{
			Connection conexao = conexaoFactory.conectar();
			System.out.println("conexão realizada com sucesso");
			
		}catch(SQLException erro){
			System.out.println("Erro ao conectar o banco de dados"+ erro);
		}
	}
}
