package br.com.locaweb.vo;

import java.util.Date;

import br.com.locaweb.others.TipoDocumento;

public class DadosCliente {
	
	private String nome;
	private String email;
	private String telefone;
	private Date dataDeCadastro;
	public TipoDocumento tipoDocumento;
	private String documento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(final String telefone) {
		this.telefone = telefone;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(final String documento) {
		this.documento = documento;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(final TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	public void setDataDeCadastro(final Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
}
