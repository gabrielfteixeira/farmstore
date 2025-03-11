package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;

import java.util.Optional;

public interface BuscarProdutoPorIdUseCase {

    Produto execute(Long id);

}
