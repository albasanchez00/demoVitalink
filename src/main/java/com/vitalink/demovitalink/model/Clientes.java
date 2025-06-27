package com.vitalink.demovitalink.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private int idCliente;
    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private String tipoDocumento;
    private String numeroIdentificacion;
    private String telefono;
    private String numeroTarjetaSanitaria;
    private String genero;
    private String correoElectronico;
    private String direccion;
    private String ciudadId;
    private String cpId;


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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



    @Override
    public String toString() {
        return "Cliente {Id:" + idCliente + "}" +
                "\nNombre → " + nombre +
                "\nApellidos → " + apellidos +
                "\nNacimiento → " + nacimiento +
                "\nTipo de Documento → " + tipoDocumento +
                "\nNumero de Identificación → " + numeroIdentificacion +
                "\nTelefono → " + telefono +
                "\nNÚmero de Tarjeta Sanitaria → " + numeroTarjetaSanitaria +
                "\nGenero → " + genero +
                "\nCorreo Electrónico → " + correoElectronico +
                "\nDireccion → " + direccion +
                "\nCiudad → " + ciudadId +
                "\nCódigo Postal → " + cpId;
    }
}
