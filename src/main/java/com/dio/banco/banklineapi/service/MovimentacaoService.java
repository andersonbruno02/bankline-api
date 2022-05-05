package com.dio.banco.banklineapi.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dio.banco.banklineapi.dto.MovimentacaoDto;
import com.dio.banco.banklineapi.model.Correntista;
import com.dio.banco.banklineapi.model.Movimentacao;
import com.dio.banco.banklineapi.model.MovimentacaoTipo;
import com.dio.banco.banklineapi.repository.CorrentistaRepository;
import com.dio.banco.banklineapi.repository.MovimentacacoRepository;

@Service
public class MovimentacaoService {

	@Autowired
	MovimentacacoRepository movimentacaoRepository;
	@Autowired
	CorrentistaRepository correntistaRepository;

	public void save(MovimentacaoDto movimentacaoDto) {
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(movimentacaoDto.getDescricao());
		movimentacao.setIdConta(movimentacaoDto.getIdConta());
		movimentacao.setTipo(movimentacaoDto.getTipo());
		BigDecimal valor = (movimentacaoDto.getTipo() == MovimentacaoTipo.RECEITA) ? movimentacaoDto.getValor() : (movimentacaoDto.getValor().multiply(BigDecimal.valueOf(-1)));

		movimentacao.setValor(valor);
		Correntista correntista = correntistaRepository.findById(movimentacaoDto.getIdConta()).orElse(null);
		if(correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo().add(valor));
		}
		movimentacaoRepository.save(movimentacao);

	}
}
