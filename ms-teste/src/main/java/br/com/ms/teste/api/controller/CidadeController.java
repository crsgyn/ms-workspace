package br.com.ms.teste.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.teste.api.model.Cidade;
import br.com.ms.teste.api.model.CidadeRepository;
import br.com.ms.teste.infra.controller.BaseController;

@RestController
@RequestMapping("/cidades")
public class CidadeController extends BaseController<Cidade, CidadeRepository> {


}
