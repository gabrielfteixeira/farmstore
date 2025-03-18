package com.farmstore.Farmstore.core.usecases.marcas;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.gateway.MarcaGateway;

public class CadastrarMarcaUseCaseImpl implements CadastrarMarcaUseCase{

    public final MarcaGateway marcaGateway;

    public CadastrarMarcaUseCaseImpl(MarcaGateway marcaGateway) {
        this.marcaGateway = marcaGateway;
    }

    @Override
    public Marca execute(Marca marca) {
        return marcaGateway.cadastrar(marca);
    }
}
