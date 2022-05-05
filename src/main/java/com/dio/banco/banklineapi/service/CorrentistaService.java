package com.dio.banco.banklineapi.service;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dio.banco.banklineapi.dto.CorrentistaDto;
import com.dio.banco.banklineapi.model.Conta;
import com.dio.banco.banklineapi.model.Correntista;
import com.dio.banco.banklineapi.repository.CorrentistaRepository;

@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRepository correntistaRepository;

	public void save(CorrentistaDto correntistaDto) {

		Correntista correntista = new Correntista();
		correntista.setNome(correntistaDto.getNome());
		correntista.setCpf(correntistaDto.getCpf());

		Conta conta = new Conta();
		conta.setSaldo(BigDecimal.valueOf(0.0));
		conta.setNumero(new Date().getTime());

		correntista.setConta(conta);
		correntistaRepository.save(correntista);
	}
}
