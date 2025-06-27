package com.vitalink.demovitalink.services;

import com.vitalink.demovitalink.model.Usuarios;
import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UsuariosDetailsServices implements UserDetailsService{
    private final UsuarioRepository usuarioRepository;

    //Constructor
    public UsuariosDetailsServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuarios usuario = usuarioRepository.findById_usuario(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));
        return new UsuariosDetails(usuario);
    }
    
}
