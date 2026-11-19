package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.out.endereco.FindEnderecoByIdOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.SaveEnderecoOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.endereco.ModificarEnderecoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnderecoUseCaseConfig {

    @Bean
    public ModificarEnderecoUseCase modificarEnderecoUseCase(
            FindEnderecoByIdOutputPort findEnderecoByIdOutputPort,
            SaveEnderecoOutputPort saveEnderecoOutputPort
    ) {
        return new ModificarEnderecoUseCase(findEnderecoByIdOutputPort, saveEnderecoOutputPort);
    }
}
