package com.dio.banco.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dio.banco.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
