package com.queirogaraffael.aurora.resort.domain.usecase.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import com.queirogaraffael.aurora.resort.domain.port.in.reserva.BuscarReservasAgendadasEmUsoPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.FindAgendadasEmUsoPorCpfOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarReservasAgendadasEmUsoPorCpfUseCase implements BuscarReservasAgendadasEmUsoPorCpfInputPort {

    private final FindAgendadasEmUsoPorCpfOutputPort findAgendadasEmUsoPorCpfOutputPort;

    public BuscarReservasAgendadasEmUsoPorCpfUseCase(FindAgendadasEmUsoPorCpfOutputPort findAgendadasEmUsoPorCpfOutputPort) {
        this.findAgendadasEmUsoPorCpfOutputPort = findAgendadasEmUsoPorCpfOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Reserva> buscarReservasAgendadasEmUsoPorCpf(String cpf, Pageable pageable) {
        return findAgendadasEmUsoPorCpfOutputPort.findAgendadasEmUsoPorCpf(cpf, pageable);
    }
}
