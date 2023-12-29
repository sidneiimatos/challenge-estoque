package io.github.sidneiimatos.challengeestoque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "representantes")
public class RepresentanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrepresentante")
    private int idRepresentante;
    @Column(name = "nomerepresentante")
    private String nomeRepresentante;
    @Column(name = "telefonerepresentante")
    private String telefoneRepresentante;
    @Column(name = "emailrepresentante")
    private String emailRepresentante;
}
