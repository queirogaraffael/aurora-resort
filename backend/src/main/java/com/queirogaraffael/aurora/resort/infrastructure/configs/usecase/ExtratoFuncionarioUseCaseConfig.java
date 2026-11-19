package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.in.extratofuncionario.BuscarExtratoPorIdInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.DeleteExtratoFuncionarioByIdOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.ExisteExtratoDeFuncionarioParaMesOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.FindByCpfFuncionarioOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.FindExtratoFuncionarioByIdOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.extratofuncionario.SaveExtratoFuncionarioOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.funcionario.FindComExtratoByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario.BuscarExtratoPorIdUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario.BuscarExtratosPorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario.CriarExtratoUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario.DeletarExtratoUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.extratofuncionario.EditarExtratoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtratoFuncionarioUseCaseConfig {

    @Bean
    public BuscarExtratoPorIdUseCase buscarExtratoPorIdUseCase(
            FindExtratoFuncionarioByIdOutputPort findExtratoFuncionarioByIdOutputPort
    ) {
        return new BuscarExtratoPorIdUseCase(findExtratoFuncionarioByIdOutputPort);
    }

    @Bean
    public BuscarExtratosPorCpfUseCase buscarExtratosPorCpfUseCase(
            FindByCpfFuncionarioOutputPort findByCpfFuncionarioOutputPort
    ) {
        return new BuscarExtratosPorCpfUseCase(findByCpfFuncionarioOutputPort);
    }

    @Bean
    public CriarExtratoUseCase criarExtratoUseCase(
            ExisteExtratoDeFuncionarioParaMesOutputPort existeExtratoDeFuncionarioParaMesOutputPort,
            FindComExtratoByCpfOutputPort findComExtratoByCpfOutputPort,
            SaveExtratoFuncionarioOutputPort saveExtratoFuncionarioOutputPort
    ) {
        return new CriarExtratoUseCase(
                existeExtratoDeFuncionarioParaMesOutputPort,
                findComExtratoByCpfOutputPort,
                saveExtratoFuncionarioOutputPort
        );
    }

    @Bean
    public DeletarExtratoUseCase deletarExtratoUseCase(
            BuscarExtratoPorIdInputPort buscarExtratoPorIdInputPort,
            DeleteExtratoFuncionarioByIdOutputPort deleteExtratoFuncionarioByIdOutputPort
    ) {
        return new DeletarExtratoUseCase(buscarExtratoPorIdInputPort, deleteExtratoFuncionarioByIdOutputPort);
    }

    @Bean
    public EditarExtratoUseCase editarExtratoUseCase(
            BuscarExtratoPorIdInputPort buscarExtratoPorIdInputPort,
            SaveExtratoFuncionarioOutputPort saveExtratoFuncionarioOutputPort
    ) {
        return new EditarExtratoUseCase(buscarExtratoPorIdInputPort, saveExtratoFuncionarioOutputPort);
    }
}
