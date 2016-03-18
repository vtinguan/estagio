package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;
import br.sceweb.servico.FabricaDeConexoes;

public class UC01CadastrarEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	static Empresa empresa2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa("batata", "batata", "batata", "batata", "batata");
		empresa2 = new Empresa("batata2", "batata2", "batata2", "batata2", "batata2");
		empresaDAO = new EmpresaDAO();
	}

	
	@Test
	public void CT01UC01FB_Cadastra_com_sucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
		assertEquals(1, empresaDAO.adiciona(empresa2));
	}
	
	@Test(expected = RuntimeException.class)  
	public void CT02UC01Insere_no_banco(){
		empresaDAO.adiciona(new Empresa());
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("batata");
		empresaDAO.exclui("batata2");
	}

}
