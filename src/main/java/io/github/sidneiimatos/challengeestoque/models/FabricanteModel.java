package io.github.sidneiimatos.challengeestoque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "fabricantes")
public class FabricanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfabricante")
    private int idFabricante;
    @Column(name = "nomefabricante")
    private String nomeFabricante;
    @Column(name="cnpjfabricante")
    private String CNPJFabricante;
    @Column(name="emailfabricante")
    private String emailFabricante;
    @Column(name = "enderecofabricante")
    private String enderecoFabricante;
    @Column(name = "telefonefabricante")
    private String telefoneFabricante;
    @ManyToOne
    @JoinColumn(name = "idrepresentante")
    private RepresentanteModel idrepresentante;
}
