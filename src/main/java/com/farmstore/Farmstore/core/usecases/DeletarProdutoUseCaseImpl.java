package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;

public class DeletarProdutoUseCaseImpl implements DeletarProdutoUseCase{

    public final FarmStoreGateway farmStoreGateway;

    public DeletarProdutoUseCaseImpl(FarmStoreGateway farmStoreGateway) {
        this.farmStoreGateway = farmStoreGateway;
    }

    @Override
    public boolean execute(Long id, boolean existe) {
        if (existe)
            return farmStoreGateway.deletar(id);
        return false;
    }
}
