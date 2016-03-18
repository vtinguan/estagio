package br.sceweb.modelo;

public class Empresa {
	String cnpj;
	String nomeDaEmpresa;
	String nomeFantasia;
	String telefone;
	String endereco;
	
	public Empresa(String cnpj, String nomeDaEmpresa, String nomeFantasia, String telefone, String endereco){
		this.cnpj = cnpj;
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Empresa(){
		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
