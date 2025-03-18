package com.farmstore.Farmstore.core.usecases.marcas;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.gateway.MarcaGateway;

import java.util.List;

public class BuscarMarcaUseCaseImpl implements BuscarMarcaUseCase{

    public final MarcaGateway marcaGateway;

    public BuscarMarcaUseCaseImpl(MarcaGateway marcaGateway) {
        this.marcaGateway = marcaGateway;
    }

    @Override
    public List<Marca> execute() {
        return marcaGateway.buscar();
    }
}
