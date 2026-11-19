package com.queirogaraffael.aurora.resort.domain.usecase.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.BuscarQuartosPorTipoInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByTipoQuartoOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarQuartosPorTipoUseCase implements BuscarQuartosPorTipoInputPort {

    private final FindByTipoQuartoOutputPort findByTipoQuartoOutputPort;

    public BuscarQuartosPorTipoUseCase(FindByTipoQuartoOutputPort findByTipoQuartoOutputPort) {
        this.findByTipoQuartoOutputPort = findByTipoQuartoOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Quarto> buscarQuartosPorTipo(TipoQuarto tipoQuarto, Pageable pageable) {
        return findByTipoQuartoOutputPort.findByTipoQuarto(tipoQuarto, pageable);
    }
}
