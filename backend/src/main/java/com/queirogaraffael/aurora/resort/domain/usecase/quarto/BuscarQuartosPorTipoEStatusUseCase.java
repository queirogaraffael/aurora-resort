package com.queirogaraffael.aurora.resort.domain.usecase.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.enums.TipoQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.BuscarQuartosPorTipoEStatusInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByTipoQuartoAndStatusOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarQuartosPorTipoEStatusUseCase implements BuscarQuartosPorTipoEStatusInputPort {

    private final FindByTipoQuartoAndStatusOutputPort findByTipoQuartoAndStatusOutputPort;

    public BuscarQuartosPorTipoEStatusUseCase(FindByTipoQuartoAndStatusOutputPort findByTipoQuartoAndStatusOutputPort) {
        this.findByTipoQuartoAndStatusOutputPort = findByTipoQuartoAndStatusOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Quarto> buscarQuartosPorTipoEStatus(TipoQuarto tipoQuarto, StatusQuarto statusQuarto, Pageable pageable) {
        return findByTipoQuartoAndStatusOutputPort.findByTipoQuartoAndStatus(tipoQuarto, statusQuarto, pageable);
    }
}
