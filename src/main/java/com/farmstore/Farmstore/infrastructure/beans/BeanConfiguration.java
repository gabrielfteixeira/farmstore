package com.farmstore.Farmstore.infrastructure.beans;

import com.farmstore.Farmstore.core.gateway.MarcaGateway;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;
import com.farmstore.Farmstore.core.usecases.*;
import com.farmstore.Farmstore.core.usecases.marcas.BuscarMarcaUseCase;
import com.farmstore.Farmstore.core.usecases.marcas.BuscarMarcaUseCaseImpl;
import com.farmstore.Farmstore.core.usecases.marcas.CadastrarMarcaUseCase;
import com.farmstore.Farmstore.core.usecases.marcas.CadastrarMarcaUseCaseImpl;
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

    @Bean
    public CadastrarMarcaUseCase cadastrarMarcaUseCase(MarcaGateway marcaGateway){
        return new CadastrarMarcaUseCaseImpl(marcaGateway);
    }

    @Bean
    public BuscarMarcaUseCase buscarMarcaUseCase(MarcaGateway marcaGateway){
        return new BuscarMarcaUseCaseImpl(marcaGateway);
    }

}
