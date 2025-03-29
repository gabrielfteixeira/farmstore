package com.farmstore.Farmstore.core.gateway;

import com.farmstore.Farmstore.core.entity.Fornecedor;

import java.util.List;

public interface FornecedorGateway {

    Fornecedor cadastrar(Fornecedor fornecedor);
    Fornecedor buscar(Long id);
    List<Fornecedor> buscar();
}
