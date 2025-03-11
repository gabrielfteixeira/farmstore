package com.farmstore.Farmstore.infrastructure.gateway;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;
import com.farmstore.Farmstore.infrastructure.mapper.ProdutoEntityMapper;
import com.farmstore.Farmstore.infrastructure.persistence.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FarmRepositoryGateway implements FarmStoreGateway {

    private final ProdutoRepository produtoRepository;
    private final ProdutoEntityMapper produtoEntityMapper;

    public FarmRepositoryGateway(ProdutoRepository produtoRepository, ProdutoEntityMapper produtoEntityMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoEntityMapper = produtoEntityMapper;
    }

    @Override
    public List<Produto> buscarProduto(){
        return produtoRepository.findAll().stream().map(produtoEntityMapper::toDomain).toList();
    }

    @Override
    public Produto buscarProdutoPorId(Long id){
        return null;
    }
}
