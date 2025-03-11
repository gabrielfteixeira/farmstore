package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;

import java.util.List;

public class BuscarProdutoPorIdUseCaseImpl implements BuscarProdutoPorIdUseCase{

    private final FarmStoreGateway farmStoreGateway;

    public BuscarProdutoPorIdUseCaseImpl(FarmStoreGateway farmStoreGateway) {
        this.farmStoreGateway = farmStoreGateway;
    }

    @Override
    public Produto execute(Long id) {
        return farmStoreGateway.buscarProdutoPorId(id);
    }
}
