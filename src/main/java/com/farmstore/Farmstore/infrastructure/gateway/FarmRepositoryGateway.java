package com.farmstore.Farmstore.infrastructure.gateway;

import com.farmstore.Farmstore.core.entity.Produto;
import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;
import com.farmstore.Farmstore.infrastructure.mapper.ProdutoEntityMapper;
import com.farmstore.Farmstore.infrastructure.persistence.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FarmRepositoryGateway implements FarmStoreGateway {

    private final ProdutoRepository produtoRepository;
    private final ProdutoEntityMapper produtoEntityMapper;

    public FarmRepositoryGateway(ProdutoRepository produtoRepository, ProdutoEntityMapper produtoEntityMapper) {
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
                //.stream()
                //.anyMatch(produtoEntity -> produtoEntity.equals(id));

    }

    @Override
    public Produto buscarProdutoPorId(Long id) {
        if(existeProdutoPorId(id))
            return null;
        return produtoEntityMapper.toDomain(produtoRepository.findById(id).orElse(null));
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
