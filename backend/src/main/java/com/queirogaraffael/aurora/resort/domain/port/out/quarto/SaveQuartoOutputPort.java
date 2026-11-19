package com.queirogaraffael.aurora.resort.domain.port.out.quarto;

import com.queirogaraffael.aurora.resort.domain.model.Quarto;

public interface SaveQuartoOutputPort {
    Quarto save(Quarto quarto);
}
