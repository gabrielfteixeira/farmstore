package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;

public class EditarProdutoUseCaseImpl implements EditarProdutoUseCase{

    private final ProdutoGateway produtoGateway;

    public EditarProdutoUseCaseImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public Produto execute(Produto produto) {
        return null;
    }
}
