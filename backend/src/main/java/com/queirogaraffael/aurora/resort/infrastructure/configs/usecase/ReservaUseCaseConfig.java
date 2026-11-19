package com.queirogaraffael.aurora.resort.infrastructure.configs.usecase;

import com.queirogaraffael.aurora.resort.domain.port.in.reserva.BuscarReservaPorIdInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.FindHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindQuartoByNumeroOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.FindAgendadasEmUsoPorCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.FindByHospedeEStatusOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.FindFinalizadasCanceladasPorCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.FindReservaByIdOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.QuartoEstaDisponivelParaDataOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.SaveReservaOutputPort;
import com.queirogaraffael.aurora.resort.domain.usecase.reserva.BuscarReservaPorIdUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.reserva.BuscarReservasAgendadasEmUsoPorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.reserva.BuscarReservasFinalizadasCanceladasPorCpfUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.reserva.BuscarReservasPorHospedeEStatusUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.reserva.CriarReservaUseCase;
import com.queirogaraffael.aurora.resort.domain.usecase.reserva.ModificarStatusReservaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReservaUseCaseConfig {

    @Bean
    public BuscarReservaPorIdUseCase buscarReservaPorIdUseCase(
            FindReservaByIdOutputPort findReservaByIdOutputPort
    ) {
        return new BuscarReservaPorIdUseCase(findReservaByIdOutputPort);
    }

    @Bean
    public BuscarReservasAgendadasEmUsoPorCpfUseCase buscarReservasAgendadasEmUsoPorCpfUseCase(
            FindAgendadasEmUsoPorCpfOutputPort findAgendadasEmUsoPorCpfOutputPort
    ) {
        return new BuscarReservasAgendadasEmUsoPorCpfUseCase(findAgendadasEmUsoPorCpfOutputPort);
    }

    @Bean
    public BuscarReservasFinalizadasCanceladasPorCpfUseCase buscarReservasFinalizadasCanceladasPorCpfUseCase(
            FindFinalizadasCanceladasPorCpfOutputPort findFinalizadasCanceladasPorCpfOutputPort
    ) {
        return new BuscarReservasFinalizadasCanceladasPorCpfUseCase(findFinalizadasCanceladasPorCpfOutputPort);
    }

    @Bean
    public BuscarReservasPorHospedeEStatusUseCase buscarReservasPorHospedeEStatusUseCase(
            FindByHospedeEStatusOutputPort findByHospedeEStatusOutputPort
    ) {
        return new BuscarReservasPorHospedeEStatusUseCase(findByHospedeEStatusOutputPort);
    }

    @Bean
    public CriarReservaUseCase criarReservaUseCase(
            FindQuartoByNumeroOutputPort findQuartoByNumeroOutputPort,
            QuartoEstaDisponivelParaDataOutputPort quartoEstaDisponivelParaDataOutputPort,
            FindHospedeByCpfOutputPort findHospedeByCpfOutputPort,
            SaveReservaOutputPort saveReservaOutputPort
    ) {
        return new CriarReservaUseCase(
                findQuartoByNumeroOutputPort,
                quartoEstaDisponivelParaDataOutputPort,
                findHospedeByCpfOutputPort,
                saveReservaOutputPort
        );
    }

    @Bean
    public ModificarStatusReservaUseCase modificarStatusReservaUseCase(
            BuscarReservaPorIdInputPort buscarReservaPorIdInputPort,
            SaveReservaOutputPort saveReservaOutputPort
    ) {
        return new ModificarStatusReservaUseCase(buscarReservaPorIdInputPort, saveReservaOutputPort);
    }
}
