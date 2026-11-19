package com.queirogaraffael.aurora.resort.domain.port.out.reserva;

import com.queirogaraffael.aurora.resort.domain.enums.StatusReserva;
import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindByHospedeEStatusOutputPort {
    Page<Reserva> findByHospedeEStatus(String cpf, StatusReserva status, Pageable pageable);
}
