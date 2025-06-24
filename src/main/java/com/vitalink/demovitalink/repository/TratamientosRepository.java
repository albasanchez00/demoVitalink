package com.vitalink.demovitalink.repository;

import com.vitalink.demovitalink.model.Tratamientos;
import com.vitalink.demovitalink.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TratamientosRepository extends JpaRepository<Usuarios, Integer>{
    Optional<Usuarios> findBynumeroTarjetaSanitaria(String numeroTarjetaSanitaria);
}
