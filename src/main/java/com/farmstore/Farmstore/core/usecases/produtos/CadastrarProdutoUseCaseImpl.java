package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;

public class CadastrarProdutoUseCaseImpl implements CadastrarProdutoUseCase{

    private final ProdutoGateway produtoGateway;

    public CadastrarProdutoUseCaseImpl(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public Produto execute(Produto produto) {
        return produtoGateway.cadastrarProduto(produto);
    }
}
