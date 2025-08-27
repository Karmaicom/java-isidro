package br.com.isiflix.sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			Scanner teclado = new Scanner(System.in);
			int v1, v2, r;
			
			System.out.print("Digite um valor: ");
			v1 = teclado.nextInt();
			System.out.print("Digite outro valor: ");
			v2 = teclado.nextInt();
			
			r = v1/v2;
			
			System.out.println("Resultado da divisao = " + r);
			teclado.close();
			
		} catch (ArithmeticException aritException) {
			System.out.println("Eita! Não pra dividir por zero");
		} catch (InputMismatchException inputException) {
			System.out.println("Eita! Informe números inteiros");
		} catch (Exception e) {
			System.out.println("Eita! DEu algum ruim que não o que é");
		} finally {
			System.out.println("Fim do programa");
		}
	}
	
}
