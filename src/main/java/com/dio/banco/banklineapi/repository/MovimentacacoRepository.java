package com.dio.banco.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dio.banco.banklineapi.model.Movimentacao;

public interface MovimentacacoRepository extends JpaRepository<Movimentacao, Integer> {

}
