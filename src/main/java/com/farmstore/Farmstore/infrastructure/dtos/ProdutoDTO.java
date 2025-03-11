package com.farmstore.Farmstore.infrastructure.dtos;

public record ProdutoDTO(
        Long id,
        String nome,
        String descricao,
        Double preco
) {

}
