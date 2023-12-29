package io.github.sidneiimatos.challengeestoque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private int idUser;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "dateregistro")
    private LocalDateTime dateRegistro;
    @Column(name = "permission")
    private int permission;

    public UserModel(int idUser, String username, String email, String password, LocalDateTime dateRegistro, int permission) {
        this.idUser = idUser;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dateRegistro = dateRegistro;
        this.permission = permission;
    }
}
