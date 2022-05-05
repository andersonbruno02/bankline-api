package com.dio.banco.banklineapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dio.banco.banklineapi.dto.MovimentacaoDto;
import com.dio.banco.banklineapi.model.Movimentacao;
import com.dio.banco.banklineapi.repository.MovimentacacoRepository;
import com.dio.banco.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	MovimentacacoRepository movimentacaoRepository;
	@Autowired
	MovimentacaoService movimentacaoService;

	@GetMapping
	public List<Movimentacao> findAll() {
		return movimentacaoRepository.findAll();
	}

	@PostMapping
	public void save(@RequestBody MovimentacaoDto movimentacaoDto) {
		movimentacaoService.save(movimentacaoDto);
	}

}
