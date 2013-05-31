package br.ufpb.dce.aps;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClasseDeTeste {
	GerenteDeProdutos	g;
	
	@Before
	public void setUp() {
		g = new GerenteDeProdutos();
	}
	
	@Test
	public void adicionaProduto() {
		assertTrue(g.adicionarProduto(0, 0, 0, "Laptop"));
		System.out.println("Adicionado com sucesso! " + g.getProduto(0));
		System.out.println("----------------------------------------------");
	}
	
	@Test
	public void getProduto() {
		g.adicionarProduto(0, 0, 0, "Laptop");
		Produto p = g.getProduto(0);
		assertEquals(p, g.getProduto(0));
		System.out.println("Lido com sucesso! " + p);
		System.out.println("----------------------------------------------");
	}
	
	@Test
	public void setProduto() {
		g.adicionarProduto(0, 0, 0, "Laptop");
		Produto p = new Produto(0);
		p.setNome("Notebook");
		assertEquals(g.getProduto(0), p);
		// -------------------------------------
		// update produto
		System.out.println("Update nome produto @test ok com mesmo c�digo");
		System.out.println("Print do objeto local => " + p);
		System.out.println("Print da lista global => " + g.getProduto(0));
		System.out.println("----------------------------------------------");
	}
	
	@Test
	public void setProduto_setCodigo() {
		g.adicionarProduto(0, 0, 0, "Laptop");
		Produto p = new Produto(0);
		assertFalse(p.equals(g.getProduto(1)));
		System.out.println("@test ok com codigos diferentes");
		System.out.println("Print do objeto local => " + p);
		System.out.println("Print da lista global => " + g.getProduto(0));
		System.out.println("----------------------------------------------");
	}
}
