package com.dio.banco.banklineapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Correntista {

	private Integer id;
	private String cpf;
	private String nome;
	private Conta conta;

}
