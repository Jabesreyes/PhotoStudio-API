package com.api.photostudio.controller;

import com.api.photostudio.domain.resumen.Resumen;
import com.api.photostudio.domain.resumen.ResumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumen")
public class ResumenController {

    @Autowired
    private ResumenService resumenService;

    @GetMapping
    public List<Resumen> getResumenes() {
        return resumenService.getAllResumenes();
    }

    @GetMapping("/{fecha}")
    public List<Resumen> getResumenByFecha(@PathVariable String fecha) {
        return resumenService.getResumenByFecha(fecha);
    }

    @PostMapping
    public Resumen addResumen(@RequestBody Resumen resumen) {
        return resumenService.saveResumen(resumen);
    }
}
