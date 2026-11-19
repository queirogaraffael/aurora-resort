package com.queirogaraffael.aurora.resort.domain.port.in.reserva;

import com.queirogaraffael.aurora.resort.domain.model.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuscarReservasFinalizadasCanceladasPorCpfInputPort {
    Page<Reserva> buscarReservasFinalizadasCanceladasPorCpf(String cpf, Pageable pageable);
}
