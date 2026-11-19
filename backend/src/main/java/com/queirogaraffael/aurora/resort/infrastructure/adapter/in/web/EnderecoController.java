package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web;

import com.queirogaraffael.aurora.resort.domain.port.in.endereco.ModificarEnderecoInputPort;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enderecos")
@Tag(name = "Endereços", description = "Operações comuns de endereço para todas as entidades que se relacionam com ele.")
public class EnderecoController {

    private final ModificarEnderecoInputPort modificarEnderecoInputPort;

    public EnderecoController(ModificarEnderecoInputPort modificarEnderecoInputPort) {
        this.modificarEnderecoInputPort = modificarEnderecoInputPort;
    }
}
