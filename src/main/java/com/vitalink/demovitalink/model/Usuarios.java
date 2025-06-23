package com.vitalink.demovitalink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private String tipoDocumento;
    private String numeroIdentificacion;
    private String telefono;
    private String numeroTarjetaSanitaria;
    private String genero;
    private String correoElectronico;
    private String password;
    private String direccion;
    private String ciudadId;
    private String cpId;
    private String rol;


    public int getId() {
        return id_usuario;
    }

    public void setId(int id) {
        this.id_usuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroTarjetaSanitaria() {
        return numeroTarjetaSanitaria;
    }

    public void setNumeroTarjetaSanitaria(String numeroTarjetaSanitaria) {
        this.numeroTarjetaSanitaria = numeroTarjetaSanitaria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "\nRol → " + rol +
                "\nNombre → " + nombre +
                "\nApellidos → " + apellidos +
                "\nNacimiento → " + nacimiento +
                "\nTipo Documento → " + tipoDocumento +
                "\nNumero Identificación → " + numeroIdentificacion +
                "\nTelefono → " + telefono +
                "\nNÚmero Tarjeta Sanitaria → " + numeroTarjetaSanitaria +
                "\nGenerov" + genero +
                "\nCorreo Electrónico → " + correoElectronico +
                "\nContrasenia → " + password +
                "\nDireccion → " + direccion +
                "\nCiudad → " + ciudadId +
                "\nCódigo Postal → " + cpId;
    }
}

