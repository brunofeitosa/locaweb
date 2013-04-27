package br.com.locaweb.others;

public class Utils {

	public static String getNomeProdutoPorTipo(int tipoProduto) {
		
		for (TipoProduto tp : TipoProduto.values()) {
			if (tp.getTipoProduto() == tipoProduto) {
				return tp.getNomeProduto();
			}
		}
		return "Tipo de produto " + tipoProduto + " não encontrado";
	}
	
	public static boolean verificaSeImprimeProduto(int tipoProduto) {
		//Quando for aliquota igual a 0% não contabilizar
		boolean retorno = true;
		for (TipoProduto tp : TipoProduto.values()){
			if (tp.getTipoProduto() == tipoProduto && tp.getAliquota() == 0) {
				retorno = false;
			}
		}
		
		return retorno;
	}
	
	public static int getAliquotaPorTipoProduto(int tipoProduto) {
		int aliquota = 0;
		for (TipoProduto tp : TipoProduto.values()) {
			if (tp.getTipoProduto() == tipoProduto) {
				aliquota = tp.getAliquota();
			}
		}
		return aliquota;
	}
}
