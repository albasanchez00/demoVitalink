package com.vitalink.demovitalink.dto;

import java.time.LocalDate;

public class RegistroCompleto {
    // Atributos del usuario
    private String username;
    private String password;
    private String rol;
    private String nombre;
    private String apellidos;
    private LocalDate nacimiento;
    private String correoElectronico;
    private String telefono;
    private String tipoDocumento;
    private String numeroIdentificacion;
    private String numeroTarjetaSanitaria;
    private String genero;
    private String direccion;
    private String ciudadId;
    private String cpId;
    private boolean terminoCondiciones;

    // Getters y setters (puedes usar Lombok para abreviarlos si lo deseas)

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

    public String getNumeroTarjetaSanitaria() { return numeroTarjetaSanitaria; }
    public void setNumeroTarjetaSanitaria(String numeroTarjetaSanitaria) { this.numeroTarjetaSanitaria = numeroTarjetaSanitaria; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCpId() { return cpId; }
    public void setCpId(String cpId) { this.cpId = cpId; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getCiudadId() { return ciudadId; }
    public void setCiudadId(String ciudadId) { this.ciudadId = ciudadId; }

    public LocalDate getNacimiento() { return nacimiento; }
    public void setNacimiento(LocalDate nacimiento) { this.nacimiento = nacimiento; }

    public boolean isTerminoCondiciones() {
        return terminoCondiciones;
    }
    public void setTerminoCondiciones(boolean terminoCondiciones) {
        this.terminoCondiciones = terminoCondiciones;
    }
}
