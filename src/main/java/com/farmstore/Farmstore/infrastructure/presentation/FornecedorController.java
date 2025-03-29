package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.usecases.fornecedor.CadastrarFornecedorUseCase;
import com.farmstore.Farmstore.infrastructure.dtos.FornecedorDto;
import com.farmstore.Farmstore.infrastructure.mapper.fornecedor.FornecedorDtoMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fornecedor/")
public class FornecedorController {

    private final CadastrarFornecedorUseCase cadastrarFornecedorUseCase;
    private final FornecedorDtoMapper fornecedorDtoMapper;

    public FornecedorController(CadastrarFornecedorUseCase cadastrarFornecedorUseCase, FornecedorDtoMapper fornecedorDtoMapper) {
        this.cadastrarFornecedorUseCase = cadastrarFornecedorUseCase;
        this.fornecedorDtoMapper = fornecedorDtoMapper;
    }

    @PostMapping()
    public FornecedorDto cadastrar(@RequestBody FornecedorDto fornecedorDto) {
        return fornecedorDtoMapper.toDto( cadastrarFornecedorUseCase
                .execute(fornecedorDtoMapper.toDomain(fornecedorDto)));
    }
}
