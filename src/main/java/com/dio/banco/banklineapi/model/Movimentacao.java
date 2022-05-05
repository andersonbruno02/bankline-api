package com.dio.banco.banklineapi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movimentacao {

	private Integer id;
	private LocalDateTime dataHora;
	private String descricao;
	private BigDecimal valor;
	private MovimentacaoTipo tipo;
}
