package com.farmstore.Farmstore.infrastructure.beans;

import com.farmstore.Farmstore.core.gateway.ProdutoGateway;
import com.farmstore.Farmstore.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public BuscarProdutoUseCase buscarProdutoUseCase(ProdutoGateway produtoGateway){
        return new BuscarProdutoUseCaseImpl(produtoGateway);
    }

    @Bean
    public BuscarProdutoPorIdUseCase buscarProdutoPorIdUseCase(ProdutoGateway produtoGateway){
        return new BuscarProdutoPorIdUseCaseImpl(produtoGateway);
    }

    @Bean
    public CadastrarProdutoUseCase cadastrarProdutoUseCase(ProdutoGateway produtoGateway){
        return new CadastrarProdutoUseCaseImpl(produtoGateway);
    }

    @Bean
    public DeletarProdutoUseCase deletarProdutoUseCase(ProdutoGateway produtoGateway){
        return new DeletarProdutoUseCaseImpl(produtoGateway);
    }
}
