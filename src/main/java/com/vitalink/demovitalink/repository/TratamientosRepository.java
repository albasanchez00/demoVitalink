package com.vitalink.demovitalink.repository;

import com.vitalink.demovitalink.model.Clientes;
import com.vitalink.demovitalink.model.Tratamientos;
import com.vitalink.demovitalink.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TratamientosRepository extends JpaRepository<Clientes, Integer>{
    Optional<Clientes> findClientesByNumeroTarjetaSanitaria(String numeroTarjetaSanitaria);
}
