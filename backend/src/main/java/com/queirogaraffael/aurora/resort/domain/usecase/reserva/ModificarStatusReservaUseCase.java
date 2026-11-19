package com.queirogaraffael.aurora.resort.domain.usecase.reserva;

import com.queirogaraffael.aurora.resort.domain.enums.StatusReserva;
import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import com.queirogaraffael.aurora.resort.domain.port.in.reserva.BuscarReservaPorIdInputPort;
import com.queirogaraffael.aurora.resort.domain.port.in.reserva.ModificarStatusReservaInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.reserva.SaveReservaOutputPort;
import org.springframework.transaction.annotation.Transactional;

public class ModificarStatusReservaUseCase implements ModificarStatusReservaInputPort {

    private final BuscarReservaPorIdInputPort buscarReservaPorIdInputPort;
    private final SaveReservaOutputPort saveReservaOutputPort;

    public ModificarStatusReservaUseCase(BuscarReservaPorIdInputPort buscarReservaPorIdInputPort, SaveReservaOutputPort saveReservaOutputPort) {
        this.buscarReservaPorIdInputPort = buscarReservaPorIdInputPort;
        this.saveReservaOutputPort = saveReservaOutputPort;
    }

    @Override
    @Transactional
    public Reserva modificarStatusReserva(Long id, StatusReserva statusReserva) {
        Reserva reserva = buscarReservaPorIdInputPort.buscarReservaPorId(id);
        reserva.setStatusReserva(statusReserva);
        return saveReservaOutputPort.save(reserva);
    }
}
