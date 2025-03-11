package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;

import java.util.List;

public interface BuscarProdutoPorIdUseCase {

    Produto execute(Long id);

}
