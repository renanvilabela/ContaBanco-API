package com.contabanco.contabanco.repository;

import com.contabanco.contabanco.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
