package com.farmstore.Farmstore.infrastructure.beans;

import com.farmstore.Farmstore.core.gateway.FarmStoreGateway;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoPorIdUseCase;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoPorIdUseCaseImpl;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoUseCase;
import com.farmstore.Farmstore.core.usecases.BuscarProdutoUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public BuscarProdutoUseCase buscarProdutoUseCase(FarmStoreGateway farmStoreGateway){
        return new BuscarProdutoUseCaseImpl(farmStoreGateway);
    }

    @Bean
    public BuscarProdutoPorIdUseCase buscarProdutoPorIdUseCase(FarmStoreGateway farmStoreGateway){
        return new BuscarProdutoPorIdUseCaseImpl(farmStoreGateway);
    }
}
