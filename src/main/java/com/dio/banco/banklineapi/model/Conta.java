package com.dio.banco.banklineapi.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Conta {

	@Column(name = "numero_conta")
	private Long numero;
	@Column(name = "saldo_conta")
	private BigDecimal saldo;

}
