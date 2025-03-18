package com.farmstore.Farmstore.infrastructure.persistence.marca;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name="enterprise")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String nome;

    @Column(name = "ein")
    String cnpj;

    @Column(name = "notes")
    String observacoes;
}
