package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;

import java.util.List;

public class BuscarProdutoUseCaseImpl implements BuscarProdutoUseCase{

    private final ProdutoGateway produtoGateway;

    public BuscarProdutoUseCaseImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public List<Produto> execute() {
        return produtoGateway.buscarProduto();
    }
}
