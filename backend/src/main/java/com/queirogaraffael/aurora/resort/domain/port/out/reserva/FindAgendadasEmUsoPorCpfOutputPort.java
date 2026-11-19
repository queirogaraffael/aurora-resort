package com.queirogaraffael.aurora.resort.domain.port.out.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindAgendadasEmUsoPorCpfOutputPort {
    Page<Reserva> findAgendadasEmUsoPorCpf(String cpf, Pageable pageable);
}
