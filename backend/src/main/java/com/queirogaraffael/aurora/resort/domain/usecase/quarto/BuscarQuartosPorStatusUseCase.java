package com.queirogaraffael.aurora.resort.domain.usecase.quarto;

import com.queirogaraffael.aurora.resort.domain.enums.StatusQuarto;
import com.queirogaraffael.aurora.resort.domain.model.Quarto;
import com.queirogaraffael.aurora.resort.domain.port.in.quarto.BuscarQuartosPorStatusInputPort;
import com.queirogaraffael.aurora.resort.domain.port.out.quarto.FindByStatusOutputPort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public class BuscarQuartosPorStatusUseCase implements BuscarQuartosPorStatusInputPort {

    private final FindByStatusOutputPort findByStatusOutputPort;

    public BuscarQuartosPorStatusUseCase(FindByStatusOutputPort findByStatusOutputPort) {
        this.findByStatusOutputPort = findByStatusOutputPort;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Quarto> buscarQuartosPorStatus(StatusQuarto statusQuarto, Pageable pageable) {
        return findByStatusOutputPort.findByStatus(statusQuarto, pageable);
    }
}
