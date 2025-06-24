package com.vitalink.demovitalink.services;

import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UsuariosDetailsServices implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;

    //Constructor
    public UsuariosDetailsServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Metodo que devuelve los datos del usuario
    @Override
    public UserDetails loadUserByUsername(String numeroIdentificacion) throws UsernameNotFoundException {
        //Busca el usuario en la base de datos
        return usuarioRepository.findByNumeroIdentificacion(numeroIdentificacion).map(UsuariosDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
    }
}
