package com.farmstore.Farmstore.infrastructure.service;

import com.farmstore.Farmstore.core.gateway.ProdutoGateway;
import com.farmstore.Farmstore.infrastructure.persistence.produto.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoGateway produtoGateway;

    public ProdutoService(ProdutoRepository produtoRepository, ProdutoGateway produtoGateway) {
        this.produtoRepository = produtoRepository;
        this.produtoGateway = produtoGateway;
    }

//    public boolean existe(Long id){
//        return farmStoreGateway.existeProdutoPorId(id);
//    }
}
