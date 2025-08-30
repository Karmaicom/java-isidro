package br.com.isiflix.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.hello.model.Produto;

@RestController
@RequestMapping("api/v1")
public class ProdutoController {

	
	@GetMapping("/produto")
	public Produto recuperarProduto() {
		Produto prod = new Produto(12345, "Computador", 2500.00);
		return prod;
	}
	
}
