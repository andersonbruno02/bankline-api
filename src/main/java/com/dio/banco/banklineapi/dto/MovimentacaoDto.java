package com.dio.banco.banklineapi.dto;

import java.math.BigDecimal;
import com.dio.banco.banklineapi.model.MovimentacaoTipo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovimentacaoDto {

	private Integer idConta;
	private String descricao;
	private BigDecimal valor;
	private MovimentacaoTipo tipo;

}
