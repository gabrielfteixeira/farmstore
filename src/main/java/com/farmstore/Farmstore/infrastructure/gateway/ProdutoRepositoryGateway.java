package com.farmstore.Farmstore.infrastructure.gateway;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;
import com.farmstore.Farmstore.infrastructure.mapper.ProdutoEntityMapper;
import com.farmstore.Farmstore.infrastructure.persistence.produto.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoRepositoryGateway implements ProdutoGateway {

    private final ProdutoRepository produtoRepository;
    private final ProdutoEntityMapper produtoEntityMapper;

    public ProdutoRepositoryGateway(ProdutoRepository produtoRepository, ProdutoEntityMapper produtoEntityMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoEntityMapper = produtoEntityMapper;
    }

    @Override
    public List<Produto> buscarProduto(){
        return produtoRepository.findAll().stream().map(produtoEntityMapper::toDomain).toList();
    }

    @Override
    public boolean existeProdutoPorId(Long id){
        return produtoRepository.findById(id).isPresent();
    }

    @Override
    public Produto buscarProdutoPorId(Long id) {
        if (produtoRepository.findById(id).isEmpty()) {
            throw new RuntimeException("Produto não encontrado para o ID: " + id);
        }
        return produtoEntityMapper.toDomain(produtoRepository.findById(id).get());

    }

    @Override
    public Produto cadastrarProduto(Produto produto) {
        return produtoEntityMapper.toDomain(produtoRepository.save(
                produtoEntityMapper.toEntity(produto)
        ));
    }

    @Override
    public boolean deletar(Long id) {
        produtoRepository.deleteById(id);
        return true;

    }
}
