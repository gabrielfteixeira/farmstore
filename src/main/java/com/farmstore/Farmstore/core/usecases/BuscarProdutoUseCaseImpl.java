package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;

import java.util.List;

public class BuscarProdutoUseCaseImpl implements BuscarProdutoUseCase{

    private final FarmStoreGateway farmStoreGateway;

    public BuscarProdutoUseCaseImpl(FarmStoreGateway farmStoreGateway) {
        this.farmStoreGateway = farmStoreGateway;
    }

    @Override
    public List<Produto> execute() {
        return farmStoreGateway.buscarProduto();
    }
}
