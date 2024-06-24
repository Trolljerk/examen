package com.ufps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufps.entity.Actividad;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, Long> {

}
