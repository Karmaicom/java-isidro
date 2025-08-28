package br.com.isiflix.sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.isiflix.exceptions.IsiException;
import br.com.isiflix.model.Produto;

public class MainClass {

	public static void main(String[] args) {
		
		// MULTICATCH
		/*
		try {			
			Produto p = new Produto();
			p.setId(1);
			p.setDescricao("Computador");
			
			System.out.println(p);
			
		} catch (IsiException | ArithmeticException | InputMismatchException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		*/
		
		try (Scanner teclado = new Scanner(System.in)) {
			
			System.out.print("Digite o primeiro valor: ");
			int v1 = teclado.nextInt();
			System.out.print("Digite o segundo valor: ");
			int v2 = teclado.nextInt();
			int r = v1/v2;
			System.out.println("Resultado: " + r);
			
		} catch (Exception e) {
			System.out.println("Epa! " + e.getMessage());
		}
		
	}
	
}
