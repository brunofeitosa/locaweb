package br.com.locaweb.vo;

public class Pedido {
	
	public int tipoProduto;
	public int qtd;
	public double vlrUnitario;

	public int getTipoProduto() {
		return tipoProduto;
	}
	
	public void setTipoProduto(final int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public int getQtd() {
		return qtd;
	}
	public void setQtd(final int qtd) {
		this.qtd = qtd;
	}

	public double getVlrUnitario() {
		return vlrUnitario;
	}
	public void setVlrUnitario(final double vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}
}
