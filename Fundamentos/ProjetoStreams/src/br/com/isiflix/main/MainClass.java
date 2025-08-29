package br.com.isiflix.main;

import java.util.ArrayList;

import br.com.isiflix.entities.Produto;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "Computador", 2000, 5));
		lista.add(new Produto(2, "Teclado", 100, 10));
		lista.add(new Produto(2, "Mouse", 35, 20));
		lista.add(new Produto(2, "Impressora", 400, 8));
		
		lista.stream().filter(x -> x.getQuantidade() >= 10).forEach(x -> System.out.println(x));
		
		System.out.println("\n------------------\n");
		lista.stream().filter(x -> x.getPreco() > 100).forEach(x -> System.out.println(x));
		
		System.out.println("\n------------------\n");
		int estoque = 0;
		estoque = lista.stream().map(p -> p.getQuantidade()).reduce(0, (q1, q2) -> q1 + q2);
		System.out.println("Quantidade em Estoque: " + estoque);
	}
	
	
}
