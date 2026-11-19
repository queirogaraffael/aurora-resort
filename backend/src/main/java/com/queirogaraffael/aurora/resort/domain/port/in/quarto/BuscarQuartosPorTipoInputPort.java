package com.queirogaraffael.aurora.resort.domain.port.in.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuscarQuartosPorTipoInputPort {
    Page<Quarto> buscarQuartosPorTipo(TipoQuarto tipoQuarto, Pageable pageable);
}
