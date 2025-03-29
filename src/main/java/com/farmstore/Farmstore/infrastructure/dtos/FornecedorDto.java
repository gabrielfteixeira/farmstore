package com.farmstore.Farmstore.infrastructure.dtos;

public record FornecedorDto(
        Long id,
        String nome,
        String cnpj,
        String endereco
) {
}
