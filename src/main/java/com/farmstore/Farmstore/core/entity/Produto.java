package com.farmstore.Farmstore.core.entity;

public record Produto(
        Long id,
        String nome,
        String descricao,
        Double preco,
        Marca marca
                      ) {
}
