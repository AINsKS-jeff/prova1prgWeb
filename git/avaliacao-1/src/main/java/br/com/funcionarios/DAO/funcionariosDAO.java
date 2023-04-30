package br.com.funcionarios.DAO;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.funcionarios.conexao.conexaoFactory;
import br.com.funcionarios.domain.funcionarios;

public class funcionariosDAO {

	public void salvar(funcionarios f) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("insert into funcionarios ");
		sql.append("(nome, cpf, Rg, Endereco, Fone, Email, DataNas, CodConjuge, DataReg)");
		sql.append("Values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		Connection conexao = conexaoFactory.conectar();
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1,f.getNome());
		comando.setString(2,f.getCpf());
		comando.setInt(3,f.getRg());
		comando.setString(4,f.getEndereco());
		comando.setInt(5,f.getFone());
		comando.setString(6,f.getEmail());
		comando.setInt(7,f.getDataNas());
		comando.setInt(8,f.getCodConjuge());
		comando.setInt(9,f.getDataReg());
		comando.executeUpdate();
		
	}
	public funcionarios buscarCod(funcionarios f) throws SQLException{
		StringBuilder sql= new StringBuilder();
		sql.append("select CodFuncionarios, Nome, cpf, Rg, Endereco, Fone, Email, DataNas, codConjuge, DataReg ");
		sql.append("from funcionarios");
		sql.append("where CodFuncionarios = ?");
		
		Connection conexao = conexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		
		comando.setInt(1, f.getCodFuncionarios());
		
		ResultSet resultado = comando.executeQuery();
		funcionarios retono = null;
		
		if(resultado.next()) {
			retono = new funcionarios();
			retono.setCodFuncionarios(resultado.getInt("CodFuncionarios"));
			retono.setNome(resultado.getString("nome"));
			retono.setCpf(resultado.getString("cpf"));
			retono.setRg(resultado.getInt("Rg"));
			retono.setEndereco(resultado.getString("Endereco"));
			retono.setFone(resultado.getInt("Fone"));
			retono.setEmail(resultado.getString("Email"));
			retono.setDataNas(resultado.getInt("DataNas"));
			retono.setCodConjuge(resultado.getInt("CodConjuge"));
			retono.setDataReg(resultado.getInt("DataReg"));
			
		}
		return retono;
	}
	public static void main (String[] args) {
		funcionarios f1 = new funcionarios();
		f1.setNome("jose");
		f1.setCpf("123456");
		f1.setRg(14587);
		f1.setEndereco("rua X, ccentro");
		f1.setFone(758);
		f1.setEmail("jose.@gmail.com");
		f1.setDataNas(100205);
		f1.setCodConjuge(5);
		f1.setDataReg(140510);
		f1 = new funcionarios();
		f1.setCodFuncionarios(1);
		
		
		funcionarios f2 = new funcionarios();
		f2.setNome("Afonso");
		f2.setCpf("84572");
		f2.setRg(95471);
		f2.setEndereco("rua Y, jardim helena");
		f2.setFone(157);
		f2.setEmail("afonso.babosa@gmail.com");
		f2.setDataNas(120802);
		f2.setCodConjuge(9);
		f2.setDataReg(140515);
		
		funcionariosDAO fdao = new funcionariosDAO();
		try {
			fdao.salvar(f1);
			fdao.salvar(f2);
			System.out.println("Dados Salvos com sucesso!");
			
			
			funcionarios f3=fdao.buscarCod(f1);
			funcionarios f4=fdao.buscarCod(f2);
		} catch(SQLException e) {
			System.out.println("Erro ao Salvar dados");
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
