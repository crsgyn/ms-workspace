package br.com.ms.teste.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.teste.api.model.Cliente;
import br.com.ms.teste.api.repository.ClienteRepository;
import br.com.ms.teste.infra.controller.BaseController;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, ClienteRepository> {
	@Autowired
	private CidadeController cidadeController;
	
}
