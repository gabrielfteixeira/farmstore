package com.farmstore.Farmstore.core.gateway;

import com.farmstore.Farmstore.core.entity.Marca;

import java.util.List;

public interface MarcaGateway {
    Marca cadastrar(Marca marca);
    List<Marca> buscar();
}
