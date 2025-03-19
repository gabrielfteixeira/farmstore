package com.farmstore.Farmstore.core.usecases.marcas;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.gateway.MarcaGateway;

public class BuscarMarcaPorIdUseCaseImpl implements BuscarMarcaPorIdUseCase{

    private final MarcaGateway marcaGateway;

    public BuscarMarcaPorIdUseCaseImpl(MarcaGateway marcaGateway) {
        this.marcaGateway = marcaGateway;
    }

    @Override
    public Marca execute(Long id) {
        return marcaGateway.buscaPorId(id);
    }
}
