package br.sceweb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import br.sceweb.servico.FabricaDeConexoes;

public class EmpresaDAO {

	Logger logger = Logger.getLogger(EmpresaDAO.class);
	
	public int adiciona(Empresa empresa){
		int codigoRetorno = 0;
		try(Connection conn = new FabricaDeConexoes().getConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into empresa(cnpj, nomeDaEmpresa, nomeFantasia, endereco, telefone) values (?,?,?,?,?)");
			ps.setString(1, empresa.getCnpj());
			ps.setString(2, empresa.getNomeDaEmpresa());
			ps.setString(3, empresa.getNomeFantasia());
			ps.setString(4, empresa.getEndereco());
			ps.setString(5, empresa.getTelefone());
			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
		logger.info("Chamou o metodo adiciona");
		return codigoRetorno;
	}
	
	public int exclui(String cnpj){
		int codigoRetorno = 0;
		try(Connection conn = new FabricaDeConexoes().getConnection()){
			PreparedStatement ps = conn.prepareStatement("DELETE FROM empresa WHERE cnpj = ?");
			ps.setString(1, cnpj);
			codigoRetorno = ps.executeUpdate();
			ps.close();
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
		logger.info("Chamou o metodo exclui");
		return codigoRetorno;
	}
}
