package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;

public class CadastrarProdutoUseCaseImpl implements CadastrarProdutoUseCase{

    private final FarmStoreGateway farmStoreGateway;

    public CadastrarProdutoUseCaseImpl(FarmStoreGateway farmStoreGateway) {
        this.farmStoreGateway = farmStoreGateway;
    }

    @Override
    public Produto execute(Produto produto) {
        return farmStoreGateway.cadastrarProduto(produto);
    }
}
