package br.com.isiflix.exceptions;

// inicialmente vamos usar uma exceção não verificada
public class IsiException extends Exception {

	private static final long serialVersionUID = 1L;

	public IsiException(String mensagem) {
		super(mensagem); 
			
	}
	
	
}
