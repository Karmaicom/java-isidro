package br.com.isiflix.main;

import java.util.ArrayList;
import java.util.function.Predicate;

import br.com.isiflix.entities.Cliente;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		lista.add( new Cliente(1, "isidro", "isidro@gmail.com", true));
		lista.add( new Cliente(1, "jose", "jose@gmail.com", false));
		lista.add( new Cliente(1, "ana", "ana@gmail.com", true));
		lista.add( new Cliente(1, "pedro", "pedro@gmail.com", true));
		lista.add( new Cliente(1, "maria", "maria@gmail.com", false));
		lista.add( new Cliente(1, "joao", "joao@gmail.com", true));
		lista.add( new Cliente(1, "paulo", "paulo@gmail.com", true));
		lista.add( new Cliente(1, "felipe", "felipe@gmail.com", false));
		lista.add( new Cliente(1, "joana", "joana@gmail.com", true));
		lista.add( new Cliente(1, "isadora", "isadora@gmail.com", true));
		
		for (Cliente cliente : lista) {
			System.out.println(cliente);
		}
		
		System.out.println("----------------------\n");		
		exibePorCriterio(lista, c -> c.isAtivo());
		
		System.out.println("----------------------\n");		
		exibePorCriterio(lista, c -> c.getNome().length() > 4);
		
		System.out.println("----------------------\n");		
		exibePorCriterio(lista, c -> c.getNome().startsWith("is"));
	}
	
	public static void exibePorCriterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate) {
		lista.forEach(c -> {
			if (predicate.test(c) ) {
				System.out.println(c);
			}
		});
	}
}
