package br.ufpb.dce.aps.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.aps.controles.ControleProduto;
import br.ufpb.dce.aps.entidades.Produto;
import br.ufpb.dce.aps.exception.ProdutoJaCadastradoException;
import br.ufpb.dce.aps.fachada.FachadaFiado;
import br.ufpb.dce.aps.entidades.Produto;
import br.ufpb.dce.aps.exception.ProdutoJaCadastradoException;
import br.ufpb.dce.aps.fachada.FachadaFiado;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.dce.aps.fachada.FachadaFiado;

public class TesteClienteTest {

	@Test
	public void testeCadastraCliente(){
		FachadaFiado ff = new FachadaFiado();
		ff.ControleCliente().cadastrarCliente(0, "Jo�o", "antonio", "novo", 97, "pra�a", "999");
		assertEquals("jo�o",ff.ControleCliente().buscarCliente("999").getNome());
		assertEquals("antonio",ff.ControleCliente().buscarCliente("999").getEndereco().getRua());
		assertEquals("novo",ff.ControleCliente().buscarCliente("999").getEndereco().getBairro());
		assertEquals(97,ff.ControleCliente().buscarCliente("999").getEndereco().getNumero());
		assertEquals("pra�a",ff.ControleCliente().buscarCliente("999").getEndereco().getReferencia());
		assertEquals("999",ff.ControleCliente().buscarCliente("999").getCpf());
		}

}
