package com.api.photostudio.domain.resumen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ResumenService {

    @Autowired
    private ResumenRepository resumenRepository;

    public List<Resumen> getAllResumenes() {
        return resumenRepository.findAll();
    }

    public Resumen saveResumen(Resumen resumen) {
        return resumenRepository.save(resumen);
    }
    public List<Resumen> getResumenByFecha(String fecha) {
        LocalDate localDate = LocalDate.parse(fecha);
        return resumenRepository.findByFecha(localDate);
    }
}
