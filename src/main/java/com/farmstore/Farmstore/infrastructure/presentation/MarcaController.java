package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.usecases.marcas.CadastrarMarcaUseCase;
import com.farmstore.Farmstore.infrastructure.dtos.MarcaDto;
import com.farmstore.Farmstore.infrastructure.mapper.marca.MarcaDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/marca/")
public class MarcaController {

    private final CadastrarMarcaUseCase cadastrarMarcaUseCase;
    private final MarcaDtoMapper marcaDtoMapper;

    public MarcaController(CadastrarMarcaUseCase cadastrarMarcaUseCase, MarcaDtoMapper marcaDtoMapper) {
        this.cadastrarMarcaUseCase = cadastrarMarcaUseCase;
        this.marcaDtoMapper = marcaDtoMapper;
    }

    @PostMapping()
    public ResponseEntity<MarcaDto> cadastrar(@RequestBody Marca marca){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(marcaDtoMapper.toDto(cadastrarMarcaUseCase.execute(marca)));
    }
}
