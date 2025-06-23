package com.vitalink.demovitalink.model;

import java.time.LocalTime;

public class Tratamientos {
    //Atributos
    private String nombreTratamiento;
    private String nombreMedicacion;
    private String formaToma;
    private String dosis;
    private String frecuencia;
    private int duracionToma;
    private LocalTime fechaInicioTratamiento;
    private LocalTime fechaFinTratamiento;
    private boolean tomaAlimento;
    private String observaciones;
    private String estadoTratamiento;
    private String relacionSintomas;
    private String tarjetaSanitaria;

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public String getNombreMedicacion() {
        return nombreMedicacion;
    }

    public void setNombreMedicacion(String nombreMedicacion) {
        this.nombreMedicacion = nombreMedicacion;
    }

    public String getFormaToma() {
        return formaToma;
    }

    public void setFormaToma(String formaToma) {
        this.formaToma = formaToma;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getDuracionToma() {
        return duracionToma;
    }

    public void setDuracionToma(int duracionToma) {
        this.duracionToma = duracionToma;
    }

    public LocalTime getFechaInicioTratamiento() {
        return fechaInicioTratamiento;
    }

    public void setFechaInicioTratamiento(LocalTime fechaInicioTratamiento) {
        this.fechaInicioTratamiento = fechaInicioTratamiento;
    }

    public LocalTime getFechaFinTratamiento() {
        return fechaFinTratamiento;
    }

    public void setFechaFinTratamiento(LocalTime fechaFinTratamiento) {
        this.fechaFinTratamiento = fechaFinTratamiento;
    }

    public boolean isTomaAlimento() {
        return tomaAlimento;
    }

    public void setTomaAlimento(boolean tomaAlimento) {
        this.tomaAlimento = tomaAlimento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstadoTratamiento() {
        return estadoTratamiento;
    }

    public void setEstadoTratamiento(String estadoTratamiento) {
        this.estadoTratamiento = estadoTratamiento;
    }

    public String getRelacionSintomas() {
        return relacionSintomas;
    }

    public void setRelacionSintomas(String relacionSintomas) {
        this.relacionSintomas = relacionSintomas;
    }

    public String getTarjetaSanitaria() {
        return tarjetaSanitaria;
    }

    public void setTarjetaSanitaria(String tarjetaSanitaria) {
        this.tarjetaSanitaria = tarjetaSanitaria;
    }

    @Override
    public String toString() {
        return "Tratamientos{" +
                "\nNombre Tratamiento → " + nombreTratamiento +
                "\nNombre Medicacion → " + nombreMedicacion +
                "\nForma de la Toma → " + formaToma +
                "\nDosis → " + dosis +
                "\nFrecuencia → " + frecuencia +
                "\nDuracion → " + duracionToma +
                "\nFecha Inicio → " + fechaInicioTratamiento +
                "\nFecha Fin → " + fechaFinTratamiento +
                "\nToma con Alimento → " + tomaAlimento +
                "\nObservaciones='" + observaciones +
                "\nEstado del Tratamiento='" + estadoTratamiento +
                "\nRelacion Sintomática='" + relacionSintomas +
                "\nTarjeta Sanitaria='" + tarjetaSanitaria;
    }
}
