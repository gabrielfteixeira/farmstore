package com.farmstore.Farmstore.infrastructure.mapper.marca;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.infrastructure.dtos.MarcaDto;
import org.springframework.stereotype.Component;

@Component
public class MarcaDtoMapper {

    public Marca toDomain(MarcaDto marcaDto){
        return new Marca(
                marcaDto.id(),
                marcaDto.nome(),
                marcaDto.cnpj(),
                marcaDto.observacoes()
        );
    }

    public MarcaDto toDto(Marca marca){
        return new MarcaDto(
                marca.id(),
                marca.nome(),
                marca.cnpj(),
                marca.observacoes()
        );
    }
}
