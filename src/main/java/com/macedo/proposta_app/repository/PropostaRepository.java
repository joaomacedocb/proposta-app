package com.macedo.proposta_app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.macedo.proposta_app.domain.Proposta;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta, Long> {
    List<Proposta> findAllByIntegradaIsFalse();

}
