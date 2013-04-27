package br.com.locaweb.execute;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.locaweb.others.TipoDocumento;
import br.com.locaweb.others.TipoProduto;
import br.com.locaweb.vo.Cliente;
import br.com.locaweb.vo.DadosCliente;
import br.com.locaweb.vo.NotaFiscal;
import br.com.locaweb.vo.Pedido;

public class ExecutarPrograma {
	public static void main (String[] args) {
		
		List<Cliente> clientes = getClientes();
		
		for (int i=0; i < clientes.size(); i++) {
			
			Cliente cli = clientes.get(i);
		    System.out.println("\nCliente: ");
		    cli.imprimeDetalhes();
		    
		    NotaFiscal nota = new NotaFiscal(cli);
		    System.out.println("\nNota Fiscal: ");
		    nota.imprimeDetalhes();
		    
		    System.out.println("=========================================================================================");
		    System.out.println("=========================================================================================");

		}
	}

	private static List<Cliente> getClientes() {
		//Montando alguns cenários para serem impressos
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		//---------------------CLIENTE 1---------------------\\
		Cliente cliente1 = new Cliente();
		DadosCliente dados1 = new DadosCliente();
		
		dados1.setNome("Cliente 1");
		dados1.setTelefone("+5511-1111-1111");
		dados1.setEmail("Cliente1@email.com.br");
		dados1.setTipoDocumento(TipoDocumento.CPF);
		dados1.setDocumento("111.111.111-11");
		dados1.setDataDeCadastro(new Date());
		cliente1.setDadosCli(dados1);
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		Pedido p1 = new Pedido();
		p1.setTipoProduto(TipoProduto.HOSPEDAGEM_DE_SITES.getTipoProduto());
		p1.setQtd(4);
		p1.setVlrUnitario(1000);
		pedidos.add(p1);

		Pedido p2 = new Pedido();
		p2.setTipoProduto(TipoProduto.LOJA_VIRTUAL.getTipoProduto());
		p2.setQtd(3);
		p2.setVlrUnitario(500);
		pedidos.add(p2);
		
		Pedido p3 = new Pedido();
		p3.setTipoProduto(TipoProduto.SERVIDOR_CLOUD.getTipoProduto());
		p3.setQtd(2);
		p3.setVlrUnitario(250);
		pedidos.add(p3);
		
		cliente1.setPedidos(pedidos);
		listaClientes.add(cliente1);
		//---------------------------------------------------\\

		
		//---------------------CLIENTE 2---------------------\\
		Cliente cliente2 = new Cliente();
		DadosCliente dados2 = new DadosCliente();
		
		dados2.setNome("Cliente 2");
		dados2.setTelefone("+5511-9999-9999");
		dados2.setEmail("Cliente2@email.com.br");
		dados2.setTipoDocumento(TipoDocumento.CPF);
		dados2.setDocumento("222.222.222-22");
		dados2.setDataDeCadastro(new Date());
		cliente2.setDadosCli(dados2);
		
		List<Pedido> pedidos2 = new ArrayList<Pedido>();
		
		Pedido p1Cli2 = new Pedido();
		p1Cli2.setTipoProduto(TipoProduto.HOSPEDAGEM_DE_SITES.getTipoProduto());
		p1Cli2.setQtd(4);
		p1Cli2.setVlrUnitario(1000);
		pedidos2.add(p1Cli2);

		cliente2.setPedidos(pedidos2);
		listaClientes.add(cliente2);
		//---------------------------------------------------\\
		

		//---------------------CLIENTE 3---------------------\\
		Cliente cliente3 = new Cliente();
		DadosCliente dados3 = new DadosCliente();
		
		dados3.setNome("Cliente 3");
		dados3.setTelefone("+5511-8888-8888");
		dados3.setEmail("Cliente3@email.com.br");
		dados3.setTipoDocumento(TipoDocumento.CNPJ);
		dados3.setDocumento("77.777.777/0001-77");
		dados3.setDataDeCadastro(new Date());
		cliente3.setDadosCli(dados3);
		
		List<Pedido> pedidos3 = new ArrayList<Pedido>();
		
		Pedido p1Cli3 = new Pedido();
		p1Cli3.setTipoProduto(TipoProduto.LOJA_VIRTUAL.getTipoProduto());
		p1Cli3.setQtd(4);
		p1Cli3.setVlrUnitario(1000);
		pedidos3.add(p1Cli3);

		cliente3.setPedidos(pedidos3);
		listaClientes.add(cliente3);
		//---------------------------------------------------\\

		return listaClientes;
	}
}
