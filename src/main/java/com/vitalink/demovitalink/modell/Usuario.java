package com.vitalink.demovitalink.modell;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int idUsuario;
    static int id = 0;
    @Setter
    @Getter
    private String nombre;

    @Setter
    @Getter
    private String apellidos;

    @Setter
    @Getter
    private LocalDate nacimiento;

    @Column(name = "tipo_documento")
    @Setter
    @Getter
    private String tipoDocumento;

    @Column(name = "numero_identificacion")
    @Setter
    @Getter
    private String numeroIdentificacion;

    @Setter
    @Getter
    private String telefono;

    @Column(name = "numero_tarjeta_sanitaria")
    @Setter
    @Getter
    private String numeroTarjetaSanitaria;

    @Setter
    @Getter
    private String genero;

    @Column(name = "correo_electronico")
    @Setter
    @Getter
    private String correoElectronico;

    @Setter
    @Getter
    private String contrasenia;

    @Setter
    @Getter
    private String direccion;

    @Column(name = "ciudad_id")
    @Setter
    @Getter
    private String ciudadId;

    @Column(name = "cp_id")
    @Setter
    @Getter
    private String cpId;


    public Usuario(){
    }

    public Usuario(int idUsuario, String cpId, String ciudadId, String direccion, String contrasenia, String correoElectronico, String genero, String numeroTarjetaSanitaria, String telefono, String numeroIdentificacion, String tipoDocumento, LocalDate nacimiento, String apellidos, String nombre) {
        this.idUsuario = idUsuario;
        this.cpId = cpId;
        this.ciudadId = ciudadId;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.genero = genero;
        this.numeroTarjetaSanitaria = numeroTarjetaSanitaria;
        this.telefono = telefono;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoDocumento = tipoDocumento;
        this.nacimiento = nacimiento;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public void asignarIdUsuario() {
        this.idUsuario =++id;
    }
    
}

