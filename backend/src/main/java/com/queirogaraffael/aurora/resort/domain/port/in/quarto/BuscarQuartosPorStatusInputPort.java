package com.queirogaraffael.aurora.resort.domain.port.in.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuscarQuartosPorStatusInputPort {
    Page<Quarto> buscarQuartosPorStatus(StatusQuarto statusQuarto, Pageable pageable);
}
