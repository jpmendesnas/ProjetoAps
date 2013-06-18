package br.ufpb.dce.aps.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.aps.fachada.FachadaFiado;

public class TesteCliente {

	private FachadaFiado ff ;
	// contantes para endereco e contato	
	private String bairro;
	private String rua;
	private String numero;
	private String telefone;
	private String referencia;
	private String cpf;
	private String nome;

	@Before
	public void setUp(){
		ff= new FachadaFiado();

		bairro = "centro";
		rua = "quintaAvenida";
		numero = "1000";
		telefone= "9999-9999";
		referencia = "perto da farmacia";
		cpf = "098765432-12";
		nome = "Vinicius";
		
		// cadastrando cliente
		ff.cadastrarCliente(numero, nome, rua, bairro, telefone, referencia, cpf);
		
	}

	@Test
	public void testeNomeDoCliente(){
		assertEquals(this.nome, ff.buscarCliente(this.cpf).getNome());
	}
	
	@Test
	public void testeCPFdoCliente(){
		assertEquals(this.cpf, ff.buscarCliente(this.cpf).getCPF());
	}
	
	@Test
	public void testeTelefoneDoCliente(){
		assertEquals(this.telefone,ff.buscarCliente(this.cpf).getTelefone());
	}
	
	@Test
	public void testeRuaDoCliente(){
		assertEquals(this.rua, ff.buscarCliente(this.cpf).getEndereco().getRua());
	}
	
	@Test
	public void testeNumeroDaCadaDoCliente(){
		assertEquals(this.numero,ff.buscarCliente(this.cpf).getEndereco().getNumero());
	}
	
	
	@Test
	public void testeClienteRemovido(){
		assertEquals(true, ff.removerCliente(this.cpf));
	}
	
	@Test
	public void testeBairroDoCliente(){
		assertEquals(this.bairro,ff.buscarCliente(this.cpf).getEndereco().getBairro());
	}
	
	@Test
	public void testaReferenciaDoCliente(){
		assertEquals(this.referencia,ff.buscarCliente(this.cpf).getEndereco().getReferencia());
	}

}