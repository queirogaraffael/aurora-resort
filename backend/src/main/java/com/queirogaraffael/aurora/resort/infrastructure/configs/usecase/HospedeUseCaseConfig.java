package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.in.hospede.BuscarHospedePorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.GetEnderecoHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.SaveEnderecoOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.FindHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.SaveHospedeOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.hospede.BuscarEnderecoHospedePorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.hospede.BuscarHospedePorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.hospede.CriarEnderecoParaHospedeUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.hospede.CriarHospedeUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.hospede.EditarHospedeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HospedeUseCaseConfig {

    @Bean
    public BuscarHospedePorCpfUseCase buscarHospedePorCpfUseCase(
            FindHospedeByCpfOutputPort findHospedeByCpfOutputPort
    ) {
        return new BuscarHospedePorCpfUseCase(findHospedeByCpfOutputPort);
    }

    @Bean
    public BuscarEnderecoHospedePorCpfUseCase buscarEnderecoHospedePorCpfUseCase(
            GetEnderecoHospedeByCpfOutputPort getEnderecoHospedeByCpfOutputPort
    ) {
        return new BuscarEnderecoHospedePorCpfUseCase(getEnderecoHospedeByCpfOutputPort);
    }

    @Bean
    public CriarHospedeUseCase criarHospedeUseCase(
            FindHospedeByCpfOutputPort findHospedeByCpfOutputPort
    ) {
        return new CriarHospedeUseCase(findHospedeByCpfOutputPort);
    }

    @Bean
    public CriarEnderecoParaHospedeUseCase criarEnderecoParaHospedeUseCase(
            BuscarHospedePorCpfInputPort buscarHospedePorCpfInputPort,
            SaveEnderecoOutputPort saveEnderecoOutputPort,
            SaveHospedeOutputPort saveHospedeOutputPort
    ) {
        return new CriarEnderecoParaHospedeUseCase(
                buscarHospedePorCpfInputPort,
                saveEnderecoOutputPort,
                saveHospedeOutputPort
        );
    }

    @Bean
    public EditarHospedeUseCase editarHospedeUseCase(
            BuscarHospedePorCpfInputPort buscarHospedePorCpfInputPort,
            SaveHospedeOutputPort saveHospedeOutputPort
    ) {
        return new EditarHospedeUseCase(buscarHospedePorCpfInputPort, saveHospedeOutputPort);
    }
}
