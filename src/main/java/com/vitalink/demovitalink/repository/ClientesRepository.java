package com.vitalink.demovitalink.repository;

import com.vitalink.demovitalink.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    Optional<Clientes> findByNumeroIdentificacion(String numeroIdentificacion);
}

