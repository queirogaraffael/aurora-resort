package com.queirogaraffael.aurora.resort.domain.usecase.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import com.queirogaraffael.aurora.resort.domain.port.in.reserva.BuscarReservasFinalizadasCanceladasPorCpfInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.FindFinalizadasCanceladasPorCpfOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarReservasFinalizadasCanceladasPorCpfUseCase implements BuscarReservasFinalizadasCanceladasPorCpfInputPort {

    private final FindFinalizadasCanceladasPorCpfOutputPort findFinalizadasCanceladasPorCpfOutputPort;

    public BuscarReservasFinalizadasCanceladasPorCpfUseCase(FindFinalizadasCanceladasPorCpfOutputPort findFinalizadasCanceladasPorCpfOutputPort) {
        this.findFinalizadasCanceladasPorCpfOutputPort = findFinalizadasCanceladasPorCpfOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Reserva> buscarReservasFinalizadasCanceladasPorCpf(String cpf, Pageable pageable) {
        return findFinalizadasCanceladasPorCpfOutputPort.findFinalizadasCanceladasPorCpf(cpf, pageable);
    }
}
