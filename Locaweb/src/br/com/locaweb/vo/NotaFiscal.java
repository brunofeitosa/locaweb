package br.com.locaweb.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.locaweb.others.Utils;

public class NotaFiscal {
	
	private final Cliente cliente;
	public Date dataDeEmissao;
	public double valorBruto = 0;
	public double valorImpostos = 0;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public NotaFiscal(final Cliente cliente) {
		this.cliente = cliente;
		dataDeEmissao = new Date();
	}

	public void imprimeDetalhes(){
		System.out.println("\n  Detalhes da nota - Início");
		
		System.out.println("     Data de emissão: " + df.format(getDataDeEmissao()));
		
		if (!cliente.getPedidos().isEmpty()) {
			System.out.println("     Produtos inclusos - Início");
			for (Pedido p : cliente.getPedidos()){
				int tipoProduto = p.getTipoProduto();
				if (Utils.verificaSeImprimeProduto(tipoProduto)) {
					float valorImpostosPorProduto = getValorImpostosPorProduto(p.getVlrUnitario(), p.getQtd(), Utils.getAliquotaPorTipoProduto(tipoProduto));
					System.out.println("\n        Tipo produto: " + Utils.getNomeProdutoPorTipo(tipoProduto));
					System.out.println("        Quantidade: " + p.getQtd());
					System.out.println("        Valor Unitário: " + p.getVlrUnitario());
					System.out.println("        Valor do Imposto por produto ((Vlr. Produto * Qtd.) * Aliquota % ): " + valorImpostosPorProduto + "\n");
				}
			}
			System.out.println("     Produtos inclusos - Fim\n");
		} else {
			System.out.println("\n     Cliente sem produtos inclusos...\n");
		}
		
		System.out.println("      " + getQtdItensNota());
		System.out.println("     Valor Bruto: " + getValorBruto());
		
		System.out.println("  Detalhes da nota - Fim");
	}
	
	public double getValorBruto() {
		if (!cliente.getPedidos().isEmpty()) {
			double soma = 0;
			for (Pedido p : cliente.getPedidos()) {
				if (Utils.verificaSeImprimeProduto(p.getTipoProduto())) {
					float valorImpostosPorProduto = getValorImpostosPorProduto(p.getVlrUnitario(), p.getQtd(), Utils.getAliquotaPorTipoProduto(p.getTipoProduto()));
					soma += valorImpostosPorProduto;
					soma += (p.getVlrUnitario() * p.getQtd());
				}
			}
			valorBruto = soma;
		}
		return valorBruto;
	}

	public float getValorImpostosPorProduto(double vlrUnit, int qtd, int aliquota) {
		return (float) ((vlrUnit * qtd) * (aliquota / 100.0));
	}

	public String getQtdItensNota() {
		String retorno = "Qtd. Itens na Nota: ";
		int qtd = 0;
		boolean naoImprimeAlgumItem = false;
		if (!cliente.getPedidos().isEmpty()) {
			for (Pedido p : cliente.getPedidos()) {
				if (Utils.verificaSeImprimeProduto(p.getTipoProduto())) {
					qtd += p.getQtd();
				} else {
					naoImprimeAlgumItem = true;
				}
			}
		}
		
		if (naoImprimeAlgumItem) {
			return retorno + qtd + " (Existe(m) item(ns) com alíquota de 0%)";
		} else {
			return retorno + qtd;
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}
}
