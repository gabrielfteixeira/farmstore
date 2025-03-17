package com.farmstore.Farmstore.core.usecases;

import com.farmstore.Farmstore.core.entity.Produto;

public interface DeletarProdutoUseCase {
    boolean execute(Long id);
}
