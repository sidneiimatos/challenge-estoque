package io.github.sidneiimatos.challengeestoque.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(name = "itens")
public class ItensModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iditens")
    private int idItens;
    @Column(name = "quantitens")
    private int QuantItens;
    @Column(name = "quantitensvend")
    private int QuantItensVend;
    @Column(name="valcompitens")
    private int ValCompItens;
    @Column(name = "valvenditens")
    private int ValVendItens;
    @Column(name = "datacompraitens")
    private LocalDateTime dataCompraItens;
    @Column(name = "dataVenciItens")
    private LocalDateTime dataVenciItens;
    @Column(name="active")
    private int active;
    @Column(name="produtocodrefproduto")
    private int produto_codrefproduto;
    @ManyToOne
    @JoinColumn(name = "fabricanteidfabricante")
    private FabricanteModel fabricanteid;
    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserModel usuario;
}
