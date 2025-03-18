package com.farmstore.Farmstore.infrastructure.mapper;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.infrastructure.persistence.produto.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProdutoEntityMapper {

    public ProdutoEntity toEntity(Produto produto){
        return new ProdutoEntity(
                produto.id(),
                produto.nome(),
                produto.descricao(),
                produto.preco()
        );
    }

    public Produto toDomain( ProdutoEntity produtoEntity){
        return new Produto(
                produtoEntity.getId(),
                produtoEntity.getNome(),
                produtoEntity.getDescricao(),
                produtoEntity.getPreco()
        );
    }
}
