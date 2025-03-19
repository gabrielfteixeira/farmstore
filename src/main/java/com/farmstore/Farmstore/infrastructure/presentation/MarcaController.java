package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.usecases.marcas.BuscarMarcaPorIdUseCase;
import com.farmstore.Farmstore.core.usecases.marcas.BuscarMarcaUseCase;
import com.farmstore.Farmstore.core.usecases.marcas.CadastrarMarcaUseCase;
import com.farmstore.Farmstore.infrastructure.dtos.MarcaDto;
import com.farmstore.Farmstore.infrastructure.mapper.marca.MarcaDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/marca/")
public class MarcaController {

    private final MarcaDtoMapper marcaDtoMapper;
    private final CadastrarMarcaUseCase cadastrarMarcaUseCase;
    private final BuscarMarcaUseCase buscarMarcaUseCase;
    private final BuscarMarcaPorIdUseCase buscarMarcaPorIdUseCase;

    public MarcaController(MarcaDtoMapper marcaDtoMapper, CadastrarMarcaUseCase cadastrarMarcaUseCase, BuscarMarcaUseCase buscarMarcaUseCase, BuscarMarcaPorIdUseCase buscarMarcaPorIdUseCase) {
        this.marcaDtoMapper = marcaDtoMapper;
        this.cadastrarMarcaUseCase = cadastrarMarcaUseCase;
        this.buscarMarcaUseCase = buscarMarcaUseCase;
        this.buscarMarcaPorIdUseCase = buscarMarcaPorIdUseCase;
    }

    @PostMapping()
    public ResponseEntity<MarcaDto> cadastrar(@RequestBody Marca marca){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(marcaDtoMapper.toDto(cadastrarMarcaUseCase.execute(marca)));
    }

    @GetMapping
    public ResponseEntity<List<MarcaDto>> buscar(){
        return ResponseEntity.status(HttpStatus.OK).body(
                buscarMarcaUseCase.execute().stream().map(marcaDtoMapper::toDto).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarcaDto> buscarPorId(@PathVariable Long id){
        if (buscarMarcaPorIdUseCase.execute(id) == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        return ResponseEntity.status(HttpStatus.OK).body(
                marcaDtoMapper.toDto(buscarMarcaPorIdUseCase.execute(id)));
    }


}
