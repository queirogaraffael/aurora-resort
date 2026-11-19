package com.queirogaraffael.aurora.resort.domain.port.out.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import java.util.Optional;

public interface FindReservaByIdOutputPort {
    Optional<Reserva> findById(Long id);
}
