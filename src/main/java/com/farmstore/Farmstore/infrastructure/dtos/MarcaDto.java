package com.farmstore.Farmstore.infrastructure.dtos;

public record MarcaDto(
        Long id,
        String nome,
        String cnpj,
        String observacoes
) {
}
