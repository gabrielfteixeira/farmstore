package com.farmstore.Farmstore.infrastructure.mapper.marca;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.infrastructure.persistence.marca.MarcaEntity;
import org.springframework.stereotype.Component;

@Component
public class MarcaEntityMapper {

    public MarcaEntity toEntity(Marca marca){
        return new MarcaEntity(
                marca.id(),
                marca.nome(),
                marca.cnpj(),
                marca.observacoes()
        );
    }
    public Marca toDomain(MarcaEntity marcaEntity){
        return new Marca(
                marcaEntity.getId(),
                marcaEntity.getNome(),
                marcaEntity.getCnpj(),
                marcaEntity.getObservacoes()
        );

    }
}
