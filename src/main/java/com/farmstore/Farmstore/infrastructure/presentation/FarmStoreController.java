package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.usecases.BuscarProdutoPorIdUseCase;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoUseCase;
import com.farmstore.Farmstore.infrastructure.dtos.ProdutoDTO;
import com.farmstore.Farmstore.infrastructure.mapper.ProdutoDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class FarmStoreController {

    private final BuscarProdutoUseCase buscarProdutoUseCase;
    private final BuscarProdutoPorIdUseCase buscarProdutoPorIdUseCase;
    private final ProdutoDtoMapper produtoDtoMapper;

    public FarmStoreController(BuscarProdutoUseCase buscarProdutoUseCase, BuscarProdutoPorIdUseCase buscarProdutoPorIdUseCase, ProdutoDtoMapper produtoDtoMapper) {
        this.buscarProdutoUseCase = buscarProdutoUseCase;
        this.buscarProdutoPorIdUseCase = buscarProdutoPorIdUseCase;
        this.produtoDtoMapper = produtoDtoMapper;
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoDTO>> listarProduto(){
        return  ResponseEntity.status(HttpStatus.OK).body(buscarProdutoUseCase.execute().stream()
                .map(produtoDtoMapper::toDto).toList());
    }
}
