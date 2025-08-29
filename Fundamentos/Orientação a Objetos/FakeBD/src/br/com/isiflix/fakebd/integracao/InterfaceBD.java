package br.com.isiflix.fakebd.integracao;

public interface InterfaceBD {

	public static final int VERSAO = 1;
	
	void conectar(String usuario, String senha);
	void executar(String comando);
	void desconectar();
	
}
