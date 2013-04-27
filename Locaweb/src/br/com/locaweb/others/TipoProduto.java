package br.com.locaweb.others;

public enum TipoProduto {
	
	HOSPEDAGEM_DE_SITES(0,0,"Hospegadem de Sites"), SERVIDOR_CLOUD(1,5,"Servidor Cloud"), LOJA_VIRTUAL(2,5,"Loja Virtual");
	
	private final int tipoProduto;
	private final int aliquota;
	private final String nomeProduto;

	TipoProduto(final int tpProd, final int aliquota, final String nomeProduto) {
		this.tipoProduto = tpProd;
		this.aliquota = aliquota;
		this.nomeProduto = nomeProduto;
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

	public int getAliquota() {
		return aliquota;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
	
}
