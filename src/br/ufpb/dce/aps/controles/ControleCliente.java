package br.ufpb.dce.aps.controles;

import java.util.LinkedList;
import java.util.List;

import br.ufpb.dce.aps.entidades.Cliente;
import br.ufpb.dce.aps.exception.CPFInvalidoException;
import br.ufpb.dce.aps.exception.ClienteJaCadastradoException;

public class ControleCliente {

	public static final int TAMANHO_DO_CPF = 11;
	private List<Cliente> clientes = new LinkedList<Cliente>();

	public void cadastrarCliente(Cliente c) throws ClienteJaCadastradoException {

		// se lista vazia ou cliente n�o existente
		if (this.buscarCliente(c.getCPF()) == null)
			this.clientes.add(c);

		// se ja existe
		else
			throw new ClienteJaCadastradoException("Cliente exception");

	}

	public Cliente buscarCliente(String cpf) throws CPFInvalidoException {
		boolean teste = this.ehValido(cpf);
		if (!teste)
			throw new CPFInvalidoException("CPF inv�lido");
		else
			for (Cliente p : clientes)
				if (p.getCPF() == cpf)
					return p;

		return null;
	}

	public boolean removerCliente(String CPF) throws CPFInvalidoException {
		boolean teste = this.ehValido(CPF);
		if (!teste)
			throw new CPFInvalidoException("cpf inv�lido");
		else {
			Cliente c = this.buscarCliente(CPF);
			if (c != null) {
				return this.clientes.remove(c);
			}
			return false;
		}
	}

	public List<Cliente> listarClientes() {
		return this.clientes;
	}

	private boolean ehValido(String cpf) {
		// testador de entrada de par�metros para busca, adi��o e remo��o
		if ((cpf.matches("[0-9]{" + cpf.length() + "}"))
				&& cpf.trim().length() == TAMANHO_DO_CPF)
			return true;
		return false;
	}

}
