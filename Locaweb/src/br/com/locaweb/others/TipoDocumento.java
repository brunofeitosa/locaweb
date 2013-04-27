package br.com.locaweb.others;

public enum TipoDocumento {
	
	CPF("CPF"), CNPJ("CNPJ");
	
	private final String tipoProduto;

	TipoDocumento(final String tipoP) {
		this.tipoProduto = tipoP;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}
	
}
