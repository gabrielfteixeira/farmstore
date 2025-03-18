package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoPorIdUseCase;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoUseCase;
import com.farmstore.Farmstore.core.usecases.CadastrarProdutoUseCase;
import com.farmstore.Farmstore.core.usecases.DeletarProdutoUseCase;
import com.farmstore.Farmstore.infrastructure.dtos.ProdutoDTO;
import com.farmstore.Farmstore.infrastructure.mapper.produto.ProdutoDtoMapper;
import com.farmstore.Farmstore.infrastructure.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProdutoController {

    private final BuscarProdutoUseCase buscarProdutoUseCase;
    private final BuscarProdutoPorIdUseCase buscarProdutoPorIdUseCase;
    private final ProdutoDtoMapper produtoDtoMapper;
    private final CadastrarProdutoUseCase cadastrarProdutoUseCase;
    private final DeletarProdutoUseCase deletarProdutoUseCase;
    private final ProdutoService produtoService;

    public ProdutoController(BuscarProdutoUseCase buscarProdutoUseCase, BuscarProdutoPorIdUseCase buscarProdutoPorIdUseCase, ProdutoDtoMapper produtoDtoMapper, CadastrarProdutoUseCase cadastrarProdutoUseCase, DeletarProdutoUseCase deletarProdutoUseCase, ProdutoService produtoService) {
        this.buscarProdutoUseCase = buscarProdutoUseCase;
        this.buscarProdutoPorIdUseCase = buscarProdutoPorIdUseCase;
        this.produtoDtoMapper = produtoDtoMapper;
        this.cadastrarProdutoUseCase = cadastrarProdutoUseCase;
        this.deletarProdutoUseCase = deletarProdutoUseCase;
        this.produtoService = produtoService;
    }

    @GetMapping("/produto")
    public ResponseEntity<List<ProdutoDTO>> listarProduto(){
        return  ResponseEntity.status(HttpStatus.OK).body(buscarProdutoUseCase.execute().stream()
                .map(produtoDtoMapper::toDto).toList());
    }

    @GetMapping("/produto/{id}")
    public ResponseEntity<ProdutoDTO> listarProdutoPorId(@PathVariable Long id){

        return  ResponseEntity.status(HttpStatus.OK).body(produtoDtoMapper.toDto(
                buscarProdutoPorIdUseCase.execute(id)
        ));
    }

    @PostMapping("/produto")
    public ResponseEntity<ProdutoDTO> cadastrarProduto(@RequestBody ProdutoDTO produtoDTO){
        Produto produto = cadastrarProdutoUseCase.execute(produtoDtoMapper.toDomain(produtoDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoDtoMapper.toDto(produto));
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id){
        boolean existe = deletarProdutoUseCase.execute(id);

        if (existe)
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
