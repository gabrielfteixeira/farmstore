package com.farmstore.Farmstore.infrastructure.presentation;

import com.farmstore.Farmstore.core.entity.Marca;
import com.farmstore.Farmstore.core.usecases.marcas.CadastrarMarcaUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/marca/")
public class MarcaController {

    private final CadastrarMarcaUseCase cadastrarMarcaUseCase;

    public MarcaController(CadastrarMarcaUseCase cadastrarMarcaUseCase) {
        this.cadastrarMarcaUseCase = cadastrarMarcaUseCase;
    }

    @PostMapping()
    public Marca cadastrar(@RequestBody Marca marca){
        return cadastrarMarcaUseCase.execute(marca);
    }
}
