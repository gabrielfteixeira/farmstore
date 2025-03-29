package com.farmstore.Farmstore.core.usecases.fornecedor;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.core.gateway.FornecedorGateway;

public class BuscaFornecedorPorIdUseCaseImpl implements BuscaFornecedorPorIdUseCase{

    private final FornecedorGateway fornecedorGateway;

    public BuscaFornecedorPorIdUseCaseImpl(FornecedorGateway fornecedorGateway) {
        this.fornecedorGateway = fornecedorGateway;
    }

    @Override
    public Fornecedor execute(Long id) {
        return fornecedorGateway.buscar(id);
    }
}
