package com.api.photostudio.domain.resumen;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "resumen")
public class Resumen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false, length = 50)
    private String tipo_Foto;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private double total;

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo_Foto() {
        return tipo_Foto;
    }

    public void setTipo_Foto(String tipo_Foto) {
        this.tipo_Foto = tipo_Foto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
