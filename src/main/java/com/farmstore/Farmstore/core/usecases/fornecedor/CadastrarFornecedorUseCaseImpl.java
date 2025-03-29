package com.farmstore.Farmstore.core.usecases.fornecedor;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.core.gateway.FornecedorGateway;

public class CadastrarFornecedorUseCaseImpl implements CadastrarFornecedorUseCase{

    private final FornecedorGateway fornecedorGateway;

    public CadastrarFornecedorUseCaseImpl(FornecedorGateway fornecedorGateway) {
        this.fornecedorGateway = fornecedorGateway;
    }

    @Override
    public Fornecedor execute(Fornecedor fornecedor) {
        return fornecedorGateway.cadastrar(fornecedor);
    }
}
