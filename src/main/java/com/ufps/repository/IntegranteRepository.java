package com.ufps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.entity.Integrante;

public interface IntegranteRepository extends JpaRepository<Integrante, Long> {
    List<Integrante> findBySemilleroId(Long semilleroId);

}
