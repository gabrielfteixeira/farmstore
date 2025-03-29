package com.farmstore.Farmstore.core.usecases.fornecedor;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.gateway.FornecedorGateway;
import com.farmstore.Farmstore.core.usecases.marcas.BuscarMarcaUseCase;

import java.util.List;

public class BuscarFornecedorUseCaseImpl implements BuscarFornecedorUseCase {

    private final FornecedorGateway fornecedorGateway;

    public BuscarFornecedorUseCaseImpl(FornecedorGateway fornecedorGateway) {
        this.fornecedorGateway = fornecedorGateway;
    }

    @Override
    public List<Fornecedor> execute() {
        return fornecedorGateway.buscar();
    }
}
