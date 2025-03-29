package com.farmstore.Farmstore.infrastructure.gateway;

import com.farmstore.Farmstore.core.entity.Fornecedor;
import com.farmstore.Farmstore.core.gateway.FornecedorGateway;
import com.farmstore.Farmstore.infrastructure.dtos.FornecedorDto;
import com.farmstore.Farmstore.infrastructure.mapper.fornecedor.FornecedorEntityMapper;
import com.farmstore.Farmstore.infrastructure.persistence.fornecedor.FornecedorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return fornecedorEntityMapper.toDomain(fornecedorRepository
                .save(fornecedorEntityMapper.toEntity(fornecedor)));
    }

    @Override
    public Fornecedor buscar(Long id) {
        //return fornecedorEntityMapper.toDomain(fornecedorRepository.findById(id).orElse(null));
        return fornecedorRepository.findById(id).map(fornecedorEntityMapper::toDomain).orElse(null);
    }

    @Override
    public List<Fornecedor> buscar() {
        return fornecedorRepository.findAll()
                .stream().map (entity -> fornecedorEntityMapper.toDomain(entity)).toList();
    }
}
