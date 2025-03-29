package com.farmstore.Farmstore.infrastructure.persistence.fornecedor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name="supplier")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FornecedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String nome;

    @Column(name = "ein")
    String cnpj;

    @Column(name = "address")
    String endereco;

}
