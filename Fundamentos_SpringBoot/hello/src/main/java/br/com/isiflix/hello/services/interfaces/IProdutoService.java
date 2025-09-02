package br.com.isiflix.hello.services.interfaces;

import br.com.isiflix.hello.models.Produto;

public interface IProdutoService {

	public Produto aplicarDesconto(Produto produto, double percentual);
	
}
