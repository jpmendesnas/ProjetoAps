
package br.ufpb.dce.aps.controles;

import br.ufpb.dce.aps.entidades.Cobranca;
import br.ufpb.dce.aps.exception.ValorInvalidoException;
import br.ufpb.dce.aps.exception.VendaException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ControleCobranca {

	public Map<String, Cobranca> mapaDeCobran�as = new HashMap<String, Cobranca>();

	// n�o posso ter uma outra cobran�a com um mesmo id de venda
	public void addCobranca(Cobranca cobranca, String idVenda)
			throws VendaException {
		if (!mapaDeCobran�as.containsKey(idVenda)) {
			this.mapaDeCobran�as.put(idVenda, cobranca);
		} else {
			throw new VendaException("venda exception na cobran�a");
		}
	}

	// A vista
	public boolean pagarCobranca(Cobranca c){
		
		return false;
	}
	
	public Cobranca exibirCobranca(String idVenda) {
		return this.mapaDeCobran�as.get(idVenda);
	}

	public Map<String, Cobranca> listarTodasAsCobrancas() {
		return this.mapaDeCobran�as;
	}


	// puxar dados do cliente para o controle de vendas
	public List<Cobranca> listarDebitosDeCliente(String CPF) throws ValorInvalidoException{
		if (CPF.trim().matches("[0-9]{11}") && CPF.length() == 11) {
			List<Cobranca> lista = new LinkedList<Cobranca>();
			for (Cobranca c : this.mapaDeCobran�as.values())
				if (c.getVenda().getCliente().getCPF() == CPF)
					lista.add(c);					
			return lista;
		}
		throw new ValorInvalidoException("CPF inv�lido");
	}
}
