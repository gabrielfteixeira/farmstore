package com.farmstore.Farmstore.infrastructure.service;

import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;
import com.farmstore.Farmstore.infrastructure.persistence.ProdutoEntity;
import com.farmstore.Farmstore.infrastructure.persistence.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final FarmStoreGateway farmStoreGateway;

    public ProdutoService(ProdutoRepository produtoRepository, FarmStoreGateway farmStoreGateway) {
        this.produtoRepository = produtoRepository;
        this.farmStoreGateway = farmStoreGateway;
    }

//    public boolean existe(Long id){
//        return farmStoreGateway.existeProdutoPorId(id);
//    }
}
