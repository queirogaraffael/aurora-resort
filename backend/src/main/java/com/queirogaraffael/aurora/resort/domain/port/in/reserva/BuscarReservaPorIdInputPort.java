package com.queirogaraffael.aurora.resort.domain.port.in.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;

public interface BuscarReservaPorIdInputPort {
    Reserva buscarReservaPorId(Long id);
}
