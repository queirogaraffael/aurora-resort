package com.queirogaraffael.aurora.resort.domain.usecase.reserva;

import com.queirogaraffael.aurora.resort.domain.enums.StatusReserva;
import com.queirogaraffael.aurora.resort.domain.model.Hospede;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import com.queirogaraffael.aurora.resort.domain.port.in.reserva.CriarReservaInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.hospede.FindHospedeByCpfOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindQuartoByNumeroOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.QuartoEstaDisponivelParaDataOutputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.SaveReservaOutputPort;
import com.queirogaraffael.aurora.resort.domain.exception.QuartoNaoEstaDisponivelParaDataException;
import com.queirogaraffael.aurora.resort.domain.exception.HospedeNotFoundException;
import com.queirogaraffael.aurora.resort.domain.exception.QuartoNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

public class CriarReservaUseCase implements CriarReservaInputPort {

    private final FindQuartoByNumeroOutputPort findQuartoByNumeroOutputPort;
    private final QuartoEstaDisponivelParaDataOutputPort quartoEstaDisponivelParaDataOutputPort;
    private final FindHospedeByCpfOutputPort findHospedeByCpfOutputPort;
    private final SaveReservaOutputPort saveReservaOutputPort;

    public CriarReservaUseCase(
            FindQuartoByNumeroOutputPort findQuartoByNumeroOutputPort,
            QuartoEstaDisponivelParaDataOutputPort quartoEstaDisponivelParaDataOutputPort,
            FindHospedeByCpfOutputPort findHospedeByCpfOutputPort,
            SaveReservaOutputPort saveReservaOutputPort
    ) {
        this.findQuartoByNumeroOutputPort = findQuartoByNumeroOutputPort;
        this.quartoEstaDisponivelParaDataOutputPort = quartoEstaDisponivelParaDataOutputPort;
        this.findHospedeByCpfOutputPort = findHospedeByCpfOutputPort;
        this.saveReservaOutputPort = saveReservaOutputPort;
    }

    @Override
    @Transactional
    public Reserva criarReserva(String cpfHospede, String numeroQuarto, LocalDateTime dataEntrada, LocalDateTime dataSaida, Integer numeroHospedes) {
        Quarto quarto = findQuartoByNumeroOutputPort.findByNumero(numeroQuarto)
                .orElseThrow(() -> new QuartoNotFoundException("Quarto com número " + numeroQuarto + " não encontrado."));

        boolean disponivel = quartoEstaDisponivelParaDataOutputPort.quartoEstaDisponivelParaData(dataEntrada, dataSaida, numeroQuarto);
        if (!disponivel) {
            throw new QuartoNaoEstaDisponivelParaDataException("Quarto não está disponível para reserva nesta data.");
        }

        Hospede hospede = findHospedeByCpfOutputPort.findByCpf(cpfHospede)
                .orElseThrow(() -> new HospedeNotFoundException("Hóspede com CPF " + cpfHospede + " não encontrado."));

        Reserva reserva = Reserva.builder()
                .dataEntrada(dataEntrada)
                .dataSaida(dataSaida)
                .numeroHospedes(numeroHospedes)
                .statusReserva(StatusReserva.AGENDADO)
                .quarto(quarto)
                .hospede(hospede)
                .build();

        return saveReservaOutputPort.save(reserva);
    }
}
