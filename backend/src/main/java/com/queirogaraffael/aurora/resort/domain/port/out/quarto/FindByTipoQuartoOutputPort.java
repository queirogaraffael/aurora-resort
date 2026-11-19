package com.queirogaraffael.aurora.resort.domain.port.out.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindByTipoQuartoOutputPort {
    Page<Quarto> findByTipoQuarto(TipoQuarto tipoQuarto, Pageable pageable);
}
