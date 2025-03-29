package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.usecases.fornecedor.BuscarFornecedorUseCase;
import com.farmstore.Farmstore.core.usecases.fornecedor.CadastrarFornecedorUseCase;
import com.farmstore.Farmstore.infrastructure.dtos.FornecedorDto;
import com.farmstore.Farmstore.infrastructure.mapper.fornecedor.FornecedorDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fornecedor/")
public class FornecedorController {

    private final FornecedorDtoMapper fornecedorDtoMapper;
    private final CadastrarFornecedorUseCase cadastrarFornecedorUseCase;
    private final BuscarFornecedorUseCase buscarFornecedorUseCase;

    public FornecedorController(FornecedorDtoMapper fornecedorDtoMapper, CadastrarFornecedorUseCase cadastrarFornecedorUseCase, BuscarFornecedorUseCase buscarFornecedorUseCase) {
        this.fornecedorDtoMapper = fornecedorDtoMapper;
        this.cadastrarFornecedorUseCase = cadastrarFornecedorUseCase;
        this.buscarFornecedorUseCase = buscarFornecedorUseCase;
    }

    @PostMapping()
    public FornecedorDto cadastrar(@RequestBody FornecedorDto fornecedorDto) {
        return fornecedorDtoMapper.toDto( cadastrarFornecedorUseCase
                .execute(fornecedorDtoMapper.toDomain(fornecedorDto)));
    }

    @GetMapping()
    public List<FornecedorDto> buscar(){
        return buscarFornecedorUseCase.execute().stream().map(
                fornecedorDtoMapper::toDto
        ).toList();
    }
}
