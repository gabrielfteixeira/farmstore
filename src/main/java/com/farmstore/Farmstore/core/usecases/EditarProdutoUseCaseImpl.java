package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;

public class EditarProdutoUseCaseImpl implements EditarProdutoUseCase{

    private final FarmStoreGateway farmStoreGateway;

    public EditarProdutoUseCaseImpl(FarmStoreGateway farmStoreGateway) {
        this.farmStoreGateway = farmStoreGateway;
    }

    @Override
    public Produto execute(Produto produto) {
        return null;
    }
}
