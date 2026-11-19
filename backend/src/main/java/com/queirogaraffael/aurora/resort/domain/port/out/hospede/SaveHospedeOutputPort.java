package com.queirogaraffael.aurora.resort.domain.port.out.hospede;

import com.queirogaraffael.aurora.resort.domain.model.Hospede;

public interface SaveHospedeOutputPort {
    Hospede save(Hospede hospede);
}
