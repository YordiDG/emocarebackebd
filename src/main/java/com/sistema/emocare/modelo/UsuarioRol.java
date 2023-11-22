package com.sistema.emocare.modelo;

import com.sistema.emocare.modelo.Rol;
import com.sistema.emocare.modelo.Usuario;

import javax.persistence.*;

@Entity
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private com.sistema.emocare.modelo.Usuario usuario;

    @ManyToOne
    private com.sistema.emocare.modelo.Rol rol;

    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public com.sistema.emocare.modelo.Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public com.sistema.emocare.modelo.Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
