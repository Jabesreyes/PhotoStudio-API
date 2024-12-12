package com.api.photostudio.domain.cliente;

import com.api.photostudio.domain.resumen.Resumen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByFecha(LocalDate fecha);
}
