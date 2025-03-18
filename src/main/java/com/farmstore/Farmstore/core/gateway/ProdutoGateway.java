package com.farmstore.Farmstore.core.gateway;

import com.farmstore.Farmstore.core.entity.Produto;

import java.util.List;

public interface ProdutoGateway {
    //as funções para ser implementadas

    List<Produto> buscarProduto();
    Produto buscarProdutoPorId(Long id);
    boolean existeProdutoPorId(Long id);

    Produto cadastrarProduto(Produto produto);

    boolean deletar(Long id);

}
