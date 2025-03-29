package com.farmstore.Farmstore.infrastructure.mapper.fornecedor;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.infrastructure.dtos.FornecedorDto;
import com.farmstore.Farmstore.infrastructure.persistence.fornecedor.FornecedorEntity;
import org.springframework.stereotype.Component;

@Component
public class FornecedorEntityMapper {

    public FornecedorEntity toEntity(Fornecedor fornecedor){
        return new FornecedorEntity(
                fornecedor.id(),
                fornecedor.nome(),
                fornecedor.cnpj(),
                fornecedor.endereco()
        );
    }

    public Fornecedor toDomain(FornecedorEntity entity){
        return new Fornecedor(
                entity.getId(),
                entity.getNome(),
                entity.getCnpj(),
                entity.getEndereco()
        );
    }
}
