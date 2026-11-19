package com.queirogaraffael.aurora.resort.domain.port.out.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;

public interface SaveReservaOutputPort {
    Reserva save(Reserva reserva);
}
