package br.com.isiflix.hello.services;

import org.springframework.stereotype.Component;

import br.com.isiflix.hello.models.Produto;
import br.com.isiflix.hello.services.interfaces.IProdutoService;

@Component
public class ProdutoServiveImpl implements IProdutoService {

	@Override
	public Produto aplicarDesconto(Produto produto, double percentual) {
		double novoPreco = produto.getPreco() - (produto.getPreco() * percentual / 100);
		produto.setPreco(novoPreco);
		return produto;
	}

}
