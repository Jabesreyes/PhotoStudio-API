package com.api.photostudio.domain.resumen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ResumenRepository extends JpaRepository<Resumen, Integer> {
    List<Resumen> findByFecha(LocalDate fecha);

}
