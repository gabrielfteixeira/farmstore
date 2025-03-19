package com.farmstore.Farmstore.core.usecases.marcas;

import com.farmstore.Farmstore.core.entity.Marca;

public interface BuscarMarcaPorIdUseCase {
    Marca execute(Long id);
}
