package com.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufps.entity.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
