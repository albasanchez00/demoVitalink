package com.vitalink.demovitalink.repository;

import com.vitalink.demovitalink.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
    Optional<Usuarios> findByNumeroIdentificacion(String numeroIdentificacion);
}
