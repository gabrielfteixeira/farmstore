package com.farmstore.Farmstore.core.gateway;

import com.farmstore.Farmstore.core.entity.Produto;

import java.util.List;

public interface FarmStoreGateway {
    //as funções para ser implementadas

    List<Produto> buscarProduto();
    Produto buscarProdutoPorId(Long id);

    Produto cadastrarProduto(Produto produto);

    boolean deletar(Long id);

}
