package com.farmstore.Farmstore.infrastructure.mapper.fornecedor;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.infrastructure.dtos.FornecedorDto;
import org.springframework.stereotype.Component;

@Component
public class FornecedorDtoMapper {

    public FornecedorDto toDto(Fornecedor fornecedor){
        return new FornecedorDto(
                fornecedor.id(),
                fornecedor.nome(),
                fornecedor.cnpj(),
                fornecedor.endereco()
        );

    }

    public Fornecedor toDomain(FornecedorDto dto){
        return new Fornecedor(
                dto.id(),
                dto.nome(),
                dto.cnpj(),
                dto.endereco()
        );
    }
}
