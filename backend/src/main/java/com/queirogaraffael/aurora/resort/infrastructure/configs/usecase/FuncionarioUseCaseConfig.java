package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.in.funcionario.BuscarFuncionarioPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.GetEnderecoFuncionarioByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.endereco.SaveEnderecoOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.FindFuncionarioByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.FindFuncionarioByNomeOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.SaveFuncionarioOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.funcionario.BuscarEnderecoFuncionarioPorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.funcionario.BuscarFuncionarioPorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.funcionario.BuscarFuncionariosPorNomeUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.funcionario.CriarEnderecoParaFuncionarioUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.funcionario.CriarFuncionarioUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.funcionario.EditarFuncionarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FuncionarioUseCaseConfig {

    @Bean
    public BuscarFuncionarioPorCpfUseCase buscarFuncionarioPorCpfUseCase(
            FindFuncionarioByCpfOutputPort findFuncionarioByCpfOutputPort
    ) {
        return new BuscarFuncionarioPorCpfUseCase(findFuncionarioByCpfOutputPort);
    }

    @Bean
    public BuscarEnderecoFuncionarioPorCpfUseCase buscarEnderecoFuncionarioPorCpfUseCase(
            GetEnderecoFuncionarioByCpfOutputPort getEnderecoFuncionarioByCpfOutputPort
    ) {
        return new BuscarEnderecoFuncionarioPorCpfUseCase(getEnderecoFuncionarioByCpfOutputPort);
    }

    @Bean
    public BuscarFuncionariosPorNomeUseCase buscarFuncionariosPorNomeUseCase(
            FindFuncionarioByNomeOutputPort findFuncionarioByNomeOutputPort
    ) {
        return new BuscarFuncionariosPorNomeUseCase(findFuncionarioByNomeOutputPort);
    }

    @Bean
    public CriarEnderecoParaFuncionarioUseCase criarEnderecoParaFuncionarioUseCase(
            BuscarFuncionarioPorCpfInputPort buscarFuncionarioPorCpfInputPort,
            SaveEnderecoOutputPort saveEnderecoOutputPort,
            SaveFuncionarioOutputPort saveFuncionarioOutputPort
    ) {
        return new CriarEnderecoParaFuncionarioUseCase(
                buscarFuncionarioPorCpfInputPort,
                saveEnderecoOutputPort,
                saveFuncionarioOutputPort
        );
    }

    @Bean
    public CriarFuncionarioUseCase criarFuncionarioUseCase(
            BuscarFuncionarioPorCpfInputPort buscarFuncionarioPorCpfInputPort
    ) {
        return new CriarFuncionarioUseCase(buscarFuncionarioPorCpfInputPort);
    }

    @Bean
    public EditarFuncionarioUseCase editarFuncionarioUseCase(
            BuscarFuncionarioPorCpfInputPort buscarFuncionarioPorCpfInputPort,
            SaveFuncionarioOutputPort saveFuncionarioOutputPort
    ) {
        return new EditarFuncionarioUseCase(buscarFuncionarioPorCpfInputPort, saveFuncionarioOutputPort);
    }
}
