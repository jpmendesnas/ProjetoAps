package br.ufpb.dce.aps.entidades;
import java.util.ArrayList;
import java.util.List;


public class Venda {

	private String idVenda;

	private Cliente cliente;

	private List<Item> itens = new ArrayList<Item>();

	private float valor;

	public String getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return itens;
	}

	public void setItems(List<Item> itens) {
		this.itens = itens;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
