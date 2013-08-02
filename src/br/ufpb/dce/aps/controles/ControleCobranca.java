package br.ufpb.dce.aps.controles;

import br.ufpb.dce.aps.entidades.Cobranca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class ControleCobranca {

	public Map<String , Cobranca> mapaDeCobran�as = 
			new HashMap <String,Cobranca>();	

	//n�o posso ter uma outra cobran�a com um mesmo id de venda
	public void addCobranca(Cobranca cobranca, String idVenda) {
		
		this.mapaDeCobran�as.put(idVenda, cobranca);
		
	}

	public Cobranca exibirCobranca(String idVenda) {
		return this.mapaDeCobran�as.get(idVenda);
	}

	

}
