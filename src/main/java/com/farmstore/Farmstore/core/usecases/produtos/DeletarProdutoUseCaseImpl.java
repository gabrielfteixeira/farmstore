package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.gateway.ProdutoGateway;

public class DeletarProdutoUseCaseImpl implements DeletarProdutoUseCase{

    public final ProdutoGateway produtoGateway;

    public DeletarProdutoUseCaseImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public boolean execute(Long id) {
        if (produtoGateway.existeProdutoPorId(id))
            return produtoGateway.deletar(id);
        return false;
    }
}
