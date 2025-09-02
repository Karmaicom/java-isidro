package br.com.isiflix.hello.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.hello.models.Usuario;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {

		//System.out.println("Recebido: " + dadosLogin.getEmail() + " / " + dadosLogin.getSenha());

		if (dadosLogin.getEmail().equals("karmaicom@gmail.com")) {
			if (dadosLogin.getSenha().equals("1234")) {
				Usuario resposta = new Usuario();
				resposta.setId(54321);
				resposta.setNome("Karmiacom Martins");
				resposta.setEmail(dadosLogin.getEmail());
				resposta.setSenha("******");
				
				return ResponseEntity.ok(resposta);
			} 
			return ResponseEntity.status(401).build();
		} 
		
		return ResponseEntity.notFound().build();
	}

}
