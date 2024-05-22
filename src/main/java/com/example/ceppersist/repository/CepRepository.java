package com.example.ceppersist.repository;

import com.example.ceppersist.domain.Cep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends JpaRepository<Cep,Long> {
}
