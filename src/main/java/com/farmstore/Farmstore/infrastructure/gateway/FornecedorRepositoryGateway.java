package com.farmstore.Farmstore.infrastructure.gateway;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.core.gateway.FornecedorGateway;
import com.farmstore.Farmstore.infrastructure.mapper.fornecedor.FornecedorEntityMapper;
import com.farmstore.Farmstore.infrastructure.persistence.fornecedor.FornecedorRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FornecedorRepositoryGateway implements FornecedorGateway {

    private final FornecedorRepository fornecedorRepository;
    private final FornecedorEntityMapper fornecedorEntityMapper;

    public FornecedorRepositoryGateway(FornecedorRepository fornecedorRepository, FornecedorEntityMapper fornecedorEntityMapper) {
        this.fornecedorRepository = fornecedorRepository;
        this.fornecedorEntityMapper = fornecedorEntityMapper;
    }

    @Override
    public Fornecedor cadastrar(Fornecedor fornecedor) {
        return fornecedorEntityMapper.toDomain(fornecedorRepository.save(fornecedorEntityMapper.toEntity(fornecedor)));
    }

    @Override
    public Fornecedor buscar(Long id) {
        return null;
    }

    @Override
    public List<Fornecedor> buscar() {
        return fornecedorRepository.findAll()
                .stream().map (entity -> fornecedorEntityMapper.toDomain(entity)).toList();
    }
}
