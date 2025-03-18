package com.farmstore.Farmstore.infrastructure.persistence.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name="product")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nome;

    @Column(name = "description")
    private String descricao;

    @Column(name = "price")
    private Double preco;
    //private Marca marca;

}
