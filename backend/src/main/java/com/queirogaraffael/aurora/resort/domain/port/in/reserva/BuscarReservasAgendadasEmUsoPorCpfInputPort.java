package com.queirogaraffael.aurora.resort.domain.port.in.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuscarReservasAgendadasEmUsoPorCpfInputPort {
    Page<Reserva> buscarReservasAgendadasEmUsoPorCpf(String cpf, Pageable pageable);
}
