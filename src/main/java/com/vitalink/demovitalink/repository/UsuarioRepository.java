package com.vitalink.demovitalink.repository;

import com.vitalink.demovitalink.modell.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByCorreoElectronico(String correoElectronico);
}
