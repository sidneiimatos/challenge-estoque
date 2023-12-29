package io.github.sidneiimatos.challengeestoque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "produtos")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codrefproduto")
    private int codRefProduto;
    @Column(name = "nomeproduto")
    private String nomeProduto;
    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserModel usuario;
}
