package br.com.locaweb.vo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.locaweb.others.Utils;

public class Cliente {
	
	private DadosCliente dadosCli;
	private List<Pedido> pedidos;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente() {
		pedidos = new ArrayList<Pedido>();
	}
	
	public DadosCliente getDadosCli() {
		return dadosCli;
	}
	public void setDadosCli(DadosCliente dadosCli) {
		this.dadosCli = dadosCli;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(final List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void imprimeDetalhes() {
		System.out.println("\n  Dados pessoas do cliente - Início");
		System.out.println("     Nome: " + getDadosCli().getNome()); 
		System.out.println("     E-mail: " + getDadosCli().getEmail());
		System.out.println("     Telefone: " + getDadosCli().getTelefone()); 
		System.out.println("     Tipo de documento: " + getDadosCli().getTipoDocumento());
		System.out.println("     Número documento: " + getDadosCli().getDocumento());
		System.out.println("     Data de cadastro: " + df.format(getDadosCli().getDataDeCadastro()));
		System.out.println("  Dados pessoas do cliente - Fim\n");
		
		System.out.println("  Pedidos do cliente - Início");
		
			if (!getPedidos().isEmpty()) {
				for (Pedido p : getPedidos()) {
					System.out.println("\n     Tipo do Produto: " + Utils.getNomeProdutoPorTipo(p.getTipoProduto())); 
					System.out.println("     Quantidade: " + p.getQtd());
					System.out.println("     Valor Unitário: " + p.getVlrUnitario() + "\n");
				}
			} else {
				System.out.println("\n     Cliente sem pedidos...\n");
			}
		System.out.println("  Pedidos do cliente - Fim\n");
	}

}
