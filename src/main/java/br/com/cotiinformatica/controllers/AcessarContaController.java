package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.cotiinformatica.dtos.AcessarContaPostDto;
import br.com.cotiinformatica.entities.Usuario;
import br.com.cotiinformatica.repositories.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Acessar Conta de Usuário")
@Controller
public class AcessarContaController {

	@ApiOperation("Serviço para autenticação de usuário.")
	@PostMapping("/api/acessar-conta")
	public void post(@RequestBody AcessarContaPostDto dto) {	

		
	}
	
}
