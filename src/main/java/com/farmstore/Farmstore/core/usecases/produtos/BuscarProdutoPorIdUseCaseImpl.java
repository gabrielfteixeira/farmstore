package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;

public class BuscarProdutoPorIdUseCaseImpl implements BuscarProdutoPorIdUseCase{

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoPorIdUseCaseImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public Produto execute(Long id) {
        return produtoGateway.buscarProdutoPorId(id);
    }
}
