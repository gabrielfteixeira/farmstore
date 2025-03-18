package com.farmstore.Farmstore.infrastructure.gateway;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.gateway.MarcaGateway;
import com.farmstore.Farmstore.infrastructure.mapper.marca.MarcaEntityMapper;
import com.farmstore.Farmstore.infrastructure.persistence.marca.MarcaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MarcaRepositoryGateway implements MarcaGateway {

    private final MarcaRepository marcaRepository;
    private final MarcaEntityMapper marcaEntityMapper;

    public MarcaRepositoryGateway(MarcaRepository marcaRepository, MarcaEntityMapper marcaEntityMapper) {
        this.marcaRepository = marcaRepository;
        this.marcaEntityMapper = marcaEntityMapper;
    }

    @Override
    public Marca cadastrar(Marca marca) {
        return  marcaEntityMapper.toDomain(
                marcaRepository.save(marcaEntityMapper.toEntity(marca)));
    }

    @Override
    public List<Marca> buscar() {
        return marcaRepository.findAll().stream()
                .map(marcaEntity -> marcaEntityMapper.toDomain(marcaEntity))
                .toList();
    }
}
