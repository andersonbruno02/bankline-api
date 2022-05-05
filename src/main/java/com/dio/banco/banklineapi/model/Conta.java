package com.dio.banco.banklineapi.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

	private Long numero;
	private BigDecimal saldo;

}
