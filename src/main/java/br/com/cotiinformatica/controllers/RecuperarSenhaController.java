package br.com.cotiinformatica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.cotiinformatica.dtos.RecuperarSenhaPostDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Recuperar Senha de Usuário")
@Controller
public class RecuperarSenhaController {

	@ApiOperation("Serviço para recuperação de senha de usuário")
	@PostMapping("/api/recuperar-senha")
	public void post(@RequestBody RecuperarSenhaPostDto dto) {

	}

}
