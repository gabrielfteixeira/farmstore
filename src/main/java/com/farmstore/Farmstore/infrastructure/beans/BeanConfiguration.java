package com.farmstore.Farmstore.infrastructure.beans;

import com.farmstore.Farmstore.core.gateway.FornecedorGateway;
import com.farmstore.Farmstore.core.gateway.MarcaGateway;
import com.farmstore.Farmstore.core.gateway.ProdutoGateway;
import com.farmstore.Farmstore.core.usecases.*;
import com.farmstore.Farmstore.core.usecases.fornecedor.*;
import com.farmstore.Farmstore.core.usecases.marcas.*;
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

    @Bean
    public BuscarMarcaPorIdUseCase buscarMarcaPorIdUseCase(MarcaGateway marcaGateway){
        return new BuscarMarcaPorIdUseCaseImpl(marcaGateway);
    }

    @Bean
    public CadastrarFornecedorUseCase cadastrarFornecedorUseCase(FornecedorGateway fornecedorGateway){
        return new CadastrarFornecedorUseCaseImpl(fornecedorGateway);
    }

    @Bean
    public BuscarFornecedorUseCase buscarFornecedorUseCase(FornecedorGateway fornecedorGateway){
        return new BuscarFornecedorUseCaseImpl(fornecedorGateway);
    }

    @Bean
    public BuscaFornecedorPorIdUseCase buscaFornecedorPorIdUseCase(FornecedorGateway fornecedorGateway){
        return new BuscaFornecedorPorIdUseCaseImpl(fornecedorGateway);
    }
}
