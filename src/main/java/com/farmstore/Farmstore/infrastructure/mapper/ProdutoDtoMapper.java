package com.farmstore.Farmstore.infrastructure.mapper;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.infrastructure.dtos.ProdutoDTO;
import org.springframework.stereotype.Component;

@Component
public class ProdutoDtoMapper {

    public Produto toDomain( ProdutoDTO produtoDTO){
        return new Produto(
                produtoDTO.id(),
                produtoDTO.nome(),
                produtoDTO.descricao(),
                produtoDTO.preco()
        );
    }

    public ProdutoDTO toDto( Produto produto ){
        return new ProdutoDTO(
                produto.id(),
                produto.nome(),
                produto.descricao(),
                produto.preco()
        );
    }
}
