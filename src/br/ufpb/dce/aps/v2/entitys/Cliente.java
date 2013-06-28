package br.ufpb.dce.aps.v2.entitys;

import java.util.List;

import br.ufpb.dce.aps.v2.entity.interfaces.Entity;
import br.ufpb.dce.aps.v2.entity.interfaces.Pessoa;

public class Cliente extends Pessoa implements Entity {
	
	private List<Entity>	conta;
	
	public List<Entity> getConta() {
		return conta;
	}
	
	public void setConta(List<Entity> conta) {
		this.conta = conta;
	}
	
}