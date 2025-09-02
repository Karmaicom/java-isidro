package br.com.isiflix.hello.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.hello.models.Produto;
import br.com.isiflix.hello.services.interfaces.IProdutoService;

@RestController
@RequestMapping("api/v1/produto")
public class ProdutoController {

	@Autowired
	private IProdutoService produtoService;
	
	@GetMapping("")
	public Produto recuperarProduto() {
		Produto prod = new Produto(12345, "Computador", 2500.00);
		prod = produtoService.aplicarDesconto(prod, 10);
		return prod;
	}

	@PostMapping("/novoProduto")
	public String cadastrarNovo(@RequestBody Produto produto) {
		System.out.println(produto);
		return "Consulte o Console";
	}
	
}
