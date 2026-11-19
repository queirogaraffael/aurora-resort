package com.queirogaraffael.aurora.resort.domain.port.in.reserva;

import com.queirogaraffael.aurora.resort.domain.enums.StatusReserva;
import com.queirogaraffael.aurora.resort.domain.model.Reserva;

public interface ModificarStatusReservaInputPort {
    Reserva modificarStatusReserva(Long id, StatusReserva statusReserva);
}
